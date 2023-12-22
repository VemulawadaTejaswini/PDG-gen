import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int count = 0;
        PrintWriter out = new PrintWriter(System.out);
        for (int l = 1; l <= N; l++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < N; k++) {
                        if (i * i + j * j + k * k + i * j + j * k + k * i == N) {
                            count++;
                        }
                    }
                }
            }
            out.println(count);
            out.flush();
            count = 0;
        }
        sc.close();
    }
}