
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] as = new String[3][3];
		for(int i = 0; i < 3 ; i++) {
			String[] sub = br.readLine().split(" ");
			for(int j = 0 ; j < 3 ; j++) {
				as [i][j] = sub[j];
			}
		}
		boolean[][] flag = new boolean[3][3] ;
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i< n ; i++) {
			String s = br.readLine();
			for(int j = 0 ; j < 3 ; j++) {
				for(int k = 0 ; k < 3 ; k++) {
					if(as[j][k].equals(s)) {
						flag[j][k] = true;
					}
				}
			}
		}	
		
		if(isBingo(flag)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		


	}

	static boolean isBingo(boolean[][] b) {
		if(b[0][0] && b[0][1] && b[0][2]||
				b[1][0] && b[1][1] && b[1][2]||
				b[2][0] && b[2][1] && b[2][2]||
				b[0][0] && b[1][0] && b[2][0]||
				b[0][1] && b[1][1] && b[2][1]||
				b[0][2] && b[1][2] && b[2][2]||
				b[1][1] && b[2][2] && b[0][0]||
				b[0][2] && b[1][1] && b[2][0] ) {
			return true;
		}
		return false;
	}
	
}
