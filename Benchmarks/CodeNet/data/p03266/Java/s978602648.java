import java.util.Scanner;

public class Main {
    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] xys = input.split(" ");

        int N = Integer.parseInt(xys[0]);
        int K = Integer.parseInt(xys[1]);

        int cnt = 0;

        // System.out.println(N);
        // System.out.println(K);
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                for (int k = 1; k < N; k++) {
                    // System.out.println(i + ", " + j + ", " + k);
                    if ((i + j) % K == 0 && (j + k) % K == 0 && (k + i) % K == 0) {
                        cnt++;
                        // System.out.println("t");
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}
