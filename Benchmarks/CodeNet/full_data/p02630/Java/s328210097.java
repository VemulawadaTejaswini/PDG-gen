import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String[] A = new String[N];
        String b = "";
        String c = "";
        for (int i = 0; i < N; i++) {
            A[i] = sc.next();
        }

        int Q = Integer.parseInt(sc.next());
        int count[] = new int[Q];
        PrintWriter out = new PrintWriter(System.out);
        for (int i = 0; i < Q; i++) {
            b = sc.next();
            c = sc.next();

            for (int j = 0; j < N; j++) {
                A[j] = A[j].replaceAll(b, c);
                count[i] += Integer.parseInt(A[j]);
            }
            out.println(count[i]);
        }

        sc.close();
        out.flush();
    }
}