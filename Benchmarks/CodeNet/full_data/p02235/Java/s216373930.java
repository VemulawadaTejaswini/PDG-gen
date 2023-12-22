import java.util.*;



public class Main {

	
	public static int lengthOfSub(String x, String y) {
		int max = 0;
		
		//initialize the table
		int[][] matches = new int[x.length()+1][y.length()+1];
		
		//for(int i = 0; i < x.length(); i++) { matches[i][0] = 0;}
		//for(int j = 0; j < y.length(); j++) { matches[0][j] = 0;}
		//now fill in the table
		
		for(int i = 0; i <= x.length(); i++) {
			for(int j = 0; j <= y.length(); j++) {
				//base case
				if( j == 0 || i == 0) {
					matches[i][j] = 0;
				}
				else if(x.charAt(i-1) == y.charAt(j-1)) {
					matches[i][j] = matches[i-1][j-1] + 1;
				}else {
					matches[i][j] = max(matches[i-1][j], matches[i][j-1]);
				}
				
				if(matches[i][j] > max) {
					max = matches[i][j];
				}
			}
		}
		
		return max;
		
	}
	
	private static int max(int i, int j) {
		if (i > j) return i;
		else if (i == j) return i;
		else return j;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int reps = in.nextInt();
		
		for(int i = 0; i < reps; i++) {
			String x = in.next();
			String y = in.next();

			System.out.println(lengthOfSub(x,y));
		}
		
		in.close();

	}

}

