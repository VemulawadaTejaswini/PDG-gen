import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        for (int i = 0; i < N; i++) {
            int B = 0;
            int C = 0;
            boolean flag = true;

            for (int j = 0; j < 10; j++) {
                int A = Integer.parseInt(sc.next());

                if (A > B) {
                    B = A;
                } else if (A > C) {
                    C = A;
                } else {
                    flag = false;
                    break;
                }
            }
            System.out.println((flag)? "YES" : "NO");
        }
    }
}