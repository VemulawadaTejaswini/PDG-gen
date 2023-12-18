import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;
        for (int i = 1; i < n; i++) {
            double tmp = i * 1.08;
            if ((int) tmp == n) {
                ans = i;
            }
        }

        if (ans == 0) {
            System.out.println(":(");
        } else {
            System.out.println(ans);
        }
    }
}
