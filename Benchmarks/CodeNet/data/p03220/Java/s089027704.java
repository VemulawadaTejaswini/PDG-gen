import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int h =sc.nextInt();
            double tmp = t - h * 0.006d;
            if (min < tmp) {
                min = tmp;
                index = i +1;
            }
        }
        System.out.println(index);
    }
}