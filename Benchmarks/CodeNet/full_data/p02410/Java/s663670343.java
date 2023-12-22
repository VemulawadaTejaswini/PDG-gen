import java.io.ByteArrayInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    String INPUT = "";

    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    void run() {
        Scanner sc = INPUT.isEmpty() ? new Scanner(System.in) : new Scanner(new ByteArrayInputStream(INPUT.getBytes()));
        PrintWriter out = new PrintWriter(System.out);

        solve(sc, out);
        out.flush();
    }

    void solve(Scanner sc, PrintWriter out) {
        int n, m;
        
        n = sc.nextInt();
        m = sc.nextInt();
        
        int A[][] = new int[n][m];
        int b[] = new int[m];
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
        	int a = 0;
			for (int j = 0; j < m; j++) {
				a += A[i][j]*b[j];
			}
			System.out.println(a);
		}
    }
}

