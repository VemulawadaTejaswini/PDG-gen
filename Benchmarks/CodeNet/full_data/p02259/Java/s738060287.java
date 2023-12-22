import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) xs[i] = input.nextInt();
        
        // sort
        int count = 0;
        for (int i = 0; i < xs.length; i++) {
            for (int j = xs.length - 1; j > i; j--) {
                if (xs[j] < xs[j-1]) {
                    int temp = xs[j];
                    xs[j] = xs[j-1];
                    xs[j-1] = temp;
                    count++;
                }
            }
        }
        print(xs);
        System.out.println(count);
    }
    
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
}