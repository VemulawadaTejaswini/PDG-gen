import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int C = Integer.parseInt(sc.next());
        int count = 0;
        int tmpA = 0;
        int tmpB = 0;
        int tmpC = 0;

        while (true) {
            if (A == B && B == C && C == A) {
                count = -1;
                break;
            }
            tmpA = A;
            tmpB = B;
            tmpC = C;

            A = tmpB / 2 + tmpC / 2;
            B = tmpC / 2 + tmpA / 2;
            C = tmpA / 2 + tmpB / 2;
            count++;

            if (A % 2 != 0 || B % 2 != 0 || C % 2 != 0) {
                break;
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        out.flush();
        sc.close();
    }
}