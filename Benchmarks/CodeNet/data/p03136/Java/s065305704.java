import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (max < tmp) {
                max = tmp;
            }
            sum += tmp;

        }
        if (max < sum-max) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}