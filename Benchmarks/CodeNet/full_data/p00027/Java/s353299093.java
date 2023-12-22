import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] cc = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int[][] k = new int[12][];
		k[0] = new int[31];
		k[1] = new int[29];
		k[2] = new int[31];
		k[3] = new int[30];
		k[4] = new int[31];
		k[5] = new int[30];
		k[6] = new int[31];
		k[7] = new int[31];
		k[8] = new int[30];
		k[9] = new int[31];
		k[10] = new int[30];
		k[11] = new int[31];
		int ck = 3;
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < k[i].length; j++) {
				k[i][j] = ck++;
				if(ck == 7) {
					ck = 0;
				}
			}
		}
		while(true) {
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			if(m == 0 && d == 0) {
				break;
			}
			System.out.println(cc[k[m-1][d-1]]);
		}
		
	}
}