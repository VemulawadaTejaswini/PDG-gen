import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exec();
    }

    static void exec() {
        PrintWriter out = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        int[] a = new int[N+1];
        int[] b = new int[N];
        for (int i = 0; i < N+1; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < N; i++) {
            b[i] = Integer.parseInt(sc.next());
        }

        int count = 0;

        for (int i = N-1; i >= 0 ; i--) {
            for (int j = 1; j >= 0 ; j--) {
                if(a[i+j] - b[i] < 0) {
                   count = count + a[i+j];
                    b[i] = b[i] - a[i+j];
                    a[i+j] = 0;
                } else {
                    count = count + b[i];
                    a[i+j] = a[i+j] - b[i];
                    b[i] = 0;
                }
            }
        }
        out.println(count);

        out.flush();

    }

}
