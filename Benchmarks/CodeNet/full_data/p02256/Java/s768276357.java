import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a == b) {
            System.out.println(a);
            return;
        }
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println(gcd(a, b));
    }
    
    private int gcd(int x, int y) {
        if (y == 0) return x;
        if (y <= 1 || x <= y) return 1;
        return gcd(y, x%y);
    }
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
}