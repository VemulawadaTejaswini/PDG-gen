import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[][] M = new int[6][2];
		M[0][0] = 1;
		M[0][1] = 2;
		M[1][0] = -1;
		M[1][1] = 3;
		M[2][0] = 1;
		M[2][1] = -1;
		M[3][0] = 4;
		M[3][1] = 5;
		M[4][0] = 5;
		M[4][1] = 2;
		M[5][0] = 2;
		M[5][1] = 1;
		
		while(true) {
			String k = stdIn.next();
			if(k.equals("#")) {
				break;
			}
			int[] k1 = new int[k.length()];
			
			for(int i = 0; i < k.length(); i++) {
				k1[i] = k.charAt(i) - '0';
			}
			int now = 0;
			for(int i = 0; i < k1.length; i++) {
				now = M[now][k1[i]];
				if(now == -1) break;
			}
			
			System.out.println((now == 5)?"Yes":"No");
		}
		

	}

}