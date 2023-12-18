import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int min = 1;
        int max = n + 1;

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            min = Math.max(min, l);
            max = Math.min(max, r);

            if (max < min) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(max - min + 1);
    }
}
