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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            rating[i] = sc.nextInt();
            sum += rating[i];
        }
        Arrays.sort(rating);
        
        for (int i = rating.length - 1, j = 0; i >= 0 && j < m; i--, j++) {
            if (rating[i] < sum / (4 * m)) {
                System.out.println("No");
                sc.close();
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}