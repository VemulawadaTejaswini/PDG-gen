import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int p[] = new int[N];
        int kakaku = 0;

        for (int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(p);

        for (int i = 0; i < K; i++) {
            kakaku += p[i];
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(kakaku);

        sc.close();
        out.flush();
    }
}