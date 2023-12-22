import java.util.*;


public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		
		
		for(int i = 0; i < q; i++) {
			String x = sc.next();
			String y = sc.next();
			System.out.println(LCS(x,y));
		}//for
	}//main
	
	
	
	static int LCS(String x, String y) {
		int [][] arr = new int[x.length() + 1] [y.length() +1];
		for (int i = 1; i < x.length()+1; i++) {
			for(int j = 1; j < y.length()+1; j++) {
				if(x.charAt(i-1) != y.charAt(j-1)) {
					arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
				} //if
				else {
					arr[i][j] = 1+arr[i-1][j-1];
				}//else
			}//for j
		}//for i
		return arr[x.length()][y.length()];
	}//LCS
		
}//class

