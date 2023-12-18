import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int r = 0;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= N; j++) {
                if (j % 2 != 0 && N % j == 0) {
                    sum++;
                }
            }
            if (sum == 8) r++;
        }
        System.out.println(r);
    }
}