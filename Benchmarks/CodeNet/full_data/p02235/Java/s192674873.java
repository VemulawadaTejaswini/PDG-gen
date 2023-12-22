import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int comps = in.nextInt();
		in.nextLine();
		for(int i = 0; i < comps; i++) {
			String x = in.nextLine();		
			String y = in.nextLine();
			System.out.println(lcs(x, y));
		}
		in.close();
	}
	
	static int lcs(String x, String y){
		int xl = x.length();
		int yl = y.length();
		int[][] lens = new int[xl + 1][yl + 1];
		
		for(int i = 0; i <= xl; i++) {
			for(int j = 0; j <= yl; j++) {
				if(i == 0 || j == 0) {
					lens[i][j] = 0;
				}
				else if(x.charAt(i-1) != y.charAt(j-1)) {
					lens[i][j] = Math.max(lens[i][j - 1], lens[i - 1][j]);
				}
				else {
					lens[i][j] = 1 + lens[i -1][j -1];
				}
			}
		}
		return lens[xl][yl];
	}
}
