import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m > n) {
            System.out.println("No");
            sc.close();
            return;
        }
        int[] rating = new int[n];
        for (int i = 0; i < n; i++) {
            rating[i] = sc.nextInt();
        }
        Arrays.sort(rating);
        
        for (int i = rating.length - 1; i >= 0 && rating.length - i <= m; i--) {
            if (rating[i] < (4 * m)) {
                System.out.println("No");
                sc.close();
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}