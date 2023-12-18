import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int max1 = Math.min(a + k - 1, b);
        for (int i = a; i <= max1; i++) {
            System.out.println(i);
        }
        
        int min2 = Math.max(max1 + 1, b - k + 1);
        for (int i = min2; i <= b; i++) {
            System.out.println(i);
        }
    }
}
