import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] str = s.nextLine().split(" ");
		int H = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		int[][] input = new int[W][H];
		for(int i=0 ; i<H ; i++) {
			String[] tmp = s.nextLine().split(" ");
			for(int j=0 ; j<W ; j++) {
				input[j][i] = Integer.parseInt(tmp[j]);
			}
		}
		System.out.println(solve(input));
	}

	public static int solve(int[][] input) {
		int[][] result = new int[input.length][input[0].length];
		for(int i=0 ; i<input.length ; i++) {
			if(input[i][0] == 0)
				result[i][0] = 1;
			else
				result[i][0] = 0;
		}
		for(int j=0 ; j<input[0].length ; j++) {
			if(input[0][j] == 0)
				result[0][j] = 1;
			else
				result[0][j] = 0;
		}

		for(int i=1 ; i<input.length ; i++) {
			for(int j=1 ; j<input[0].length ; j++) {
				if(input[i][j] == 0) {
					int min = Math.min(result[i-1][j], result[i][j-1]);
					min = Math.min(min, result[i-1][j-1]);
					result[i][j] = min + 1;
				}
				else
					result[i][j] = 0;
			}
		}
		int max = 0;
		for(int i=1 ; i<input.length ; i++) {
			for(int j=1 ; j<input[0].length ; j++) {
				max = Math.max(max, result[i][j]);
			}
		}
		return max*max;
	}

}