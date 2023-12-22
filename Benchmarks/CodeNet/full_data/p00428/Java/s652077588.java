import java.util.Scanner;

public class Main{
	public static int[] descend(int[] result){
		int[] ans = new int[result.length];
		for(int i = 0; i < result.length; i++){
			int max = 0;
			for(int j = 0; j < result.length; j++){
				if( result[j] > result[max] ){
					max = j;
				}
			}
			result[max] = -1;
			ans[i] = max+1;
		}
		return ans;
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		int[][] result = new int[1000][];
		int index = 0;
		
		while( n != 0 || m != 0 ){
			int[][] p = new int[n][m];
			result[index] = new int[m];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					p[i][j] = stdIn.nextInt();
					result[index][j] += p[i][j];
				}
			}
			index++;
			n = stdIn.nextInt();
			m = stdIn.nextInt();
		}
		
		for(int i = 0; i < index; i++){
			int[] ans = new int[result[i].length];
			ans = descend(result[i]);
			for(int j = 0; j < result[i].length-1; j++){
				System.out.print(ans[j] + " ");
			}
			System.out.println(ans[result[i].length-1]);
		}
	}
}