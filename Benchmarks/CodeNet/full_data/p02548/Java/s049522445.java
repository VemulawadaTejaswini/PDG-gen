import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static PrintWriter out;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = Integer.parseInt(sc.next());
        int answer = 0;
        //        for (int i = 1; i <= (n - 1); i++) {
        //            for (int j = 1; j <= (n / i); j++) {
        //                for (int k = 1; k <= (n - (i * j)); k++) {
        //                    int calc = (i * j) + k;
        //                    if (calc == n) {
        //                        answer++;
        //                        break;
        //                    }
        //                }
        //            }
        //        }

        for (int c = 1; c <= (n - 1); c++) {
            for (int b = 1; b <= (n - c); b++) {
                int a = (n - c) / b;
                int calc = (a * b) + c;
                if (calc == n) {
                    answer++;
                }
            }
        }

        out.println(answer);
        sc.close();
        out.close();
    }

}