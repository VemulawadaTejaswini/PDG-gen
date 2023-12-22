import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int N = sc.nextInt();
            int ans = 0;

            for (int i = 0; i < N; i++) {
                int s = sc.nextInt();
                int f = sc.nextInt();

                if ( a < f && s < b ) {
                    ans = 1;
                }
            }
            System.out.println(ans);
        }
    }
}

