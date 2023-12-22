import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            if (N == 0) break;
            boolean[] ok = new boolean[8000000];
            int pos = M;
            for (int i = 0; i < N; i++) {
                while (ok[pos]) {
                    pos++;
                }
                for (int j = pos; j < ok.length; j += pos) {
                    ok[j] = true;
                }
            }
            while (ok[pos]) {
                pos++;
            }
            System.out.println(pos);
        }

    }


}