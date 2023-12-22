import java.util.*;

public class Main {
	int[][] arr;
	public Main(String a, String b) {
		arr = new int[a.length() + 1][b.length() + 1];
		arr[0][0] = 0;
	}
	
	int LCS(String a, String b){
		int max  = 0;
		
		for(int i = 1; i < a.length(); i++) {
			for(int j = 1; j < b.length(); j++) {
				if(a.charAt(i) == b.charAt(j)) {
					this.arr[i][j] = 1 + this.arr[i-1][j-1];
				}
				else {
					this.arr[i][j] = Math.max(this.arr[i - 1][j], this.arr[i][j -1]);
				}
				
				if(this.arr[i][j] > this.arr[i][ j -1]) {
					max = this.arr[i][j];
				}
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		
		for(int i=0; i<q; i++) {
			String a = " " + in.next();
			String b = " " + in.next();
			
			Main program = new Main(a, b);
			System.out.println(program.LCS(a, b));
			
		}
		

	}

}

