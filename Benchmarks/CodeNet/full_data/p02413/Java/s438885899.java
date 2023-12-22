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
        int r,c;
        
        r = sc.nextInt();
        c = sc.nextInt();
        
        int mat[][] = new int[r][c];
        
        for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
	
		for (int i = 0; i < r; i++) {
        	int sum = 0;
			for (int j = 0; j < c; j++) {
				System.out.print(mat[i][j] + " ");
				sum += mat[i][j];
			}
			System.out.println(sum);
		}
		for (int j = 0; j < c; j++) {
        	int sum = 0;
        	for (int i = 0; i < r; i++) {
        		sum += mat[i][j];
			}
			System.out.print(sum + " ");
		}
		
		int sum = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sum += mat[i][j];
			}
		}
		System.out.println(sum);
    }
}

