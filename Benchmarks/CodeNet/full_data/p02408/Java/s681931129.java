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
		int flg[][] = new int[4][13];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				flg[i][j] = 1;
			}
		}
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String S = sc.next();
			int a = sc.nextInt();
			if (S.equals("S")) flg[0][a-1]=0;
			if (S.equals("H")) flg[1][a-1]=0;
			if (S.equals("C")) flg[2][a-1]=0;
			if (S.equals("D")) flg[3][a-1]=0;
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				if (flg[i][j] == 1) {
					if (i == 0) System.out.print("S ");
					if (i == 1) System.out.print("H ");
					if (i == 2) System.out.print("C ");
					if (i == 3) System.out.print("D ");
					System.out.println(j+1);
				}
			}
		}
	}
}

