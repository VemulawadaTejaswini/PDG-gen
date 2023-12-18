import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int cnt = 0;

        for (int i = 1, len = Math.min(A, B); i <= len; i++) {
            if ((double)A % i == 0d && (double)B % i == 0d) {
                cnt++;
                if (cnt == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}