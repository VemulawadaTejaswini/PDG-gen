
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 0; b < n; b++) {
                if ((a % b) >= k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
