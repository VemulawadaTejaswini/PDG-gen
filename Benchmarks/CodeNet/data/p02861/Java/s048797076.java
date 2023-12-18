import java.io.PrintWriter;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int x[] = new int[N];
        int y[] = new int[N];
        for (int i=0; i<N; i++) {
            x[i] =  Integer.parseInt(sc.next());
            y[i] =  Integer.parseInt(sc.next());
        }
        sc.close();

        double sum = 0.0;
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (j==i)
                    continue;
                sum += Math.pow(Math.pow(x[i]-x[j], 2) + Math.pow(y[i]-y[j], 2), 0.5);
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(sum/N);
        out.flush();
    }
}