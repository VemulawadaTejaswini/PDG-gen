import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int x = 1;
            int c = 0;
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                if (a == x) {
                    x++;
                } else {
                    c++;
                }
            }

            if (c == N) {
                c = -1;
            }

            System.out.println(c);
        }
    }

}
