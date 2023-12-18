import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main tr = new Main();
		tr.test(sc);
		sc.close();
	}

	void test(Scanner sc){
		int R = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		char[][]a= new char[R][C];
		for (int r = 0; r < R; r++) {
			String n = sc.nextLine();
			a[r] = n.toCharArray();
		}

		int[] RC = new int[R];
		int rows=R;
		for (int r = 0; r < R; r++) {
			int dot = 0;
			for (int c = 0; c < C; c++) {
				if(a[r][c] == '.'){
					dot++;
				}else{
					break;
				}
			}
			if(dot==C){
				RC[r]=1;
				rows--;
			}
		}

		int[] CC = new int[C];
		int cols = C;
		for (int c = 0; c < C; c++) {
			int dot = 0;
			for (int r = 0; r < R; r++) {
				if(a[r][c] == '.'){
					dot++;
				}else{
					break;
				}
			}
			if(dot==R){
				CC[c]=1;
				cols--;
			}
		}


		char[][]out = new char[rows][cols];
		int rn=0;
		for (int r = 0; r < R; r++) {
			if(RC[r]!=1){
				int cn=0;
				for (int c = 0; c < C; c++) {
					if(CC[c]!=1){
						out[rn][cn] = a[r][c];
						cn++;
					}
				}
				rn++;
			}
		}

		// show
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				System.out.print(out[r][c]);
			}
			System.out.println();
		}

	}
}
