import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int[][] m = new int[n][n];
			ArrayList<Integer> mins = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				int min = Integer.MAX_VALUE;
				for(int j=0;j<n;j++){
					m[i][j] = sc.nextInt();
					min = Math.min(min,m[i][j]);
				}
				mins.add(min);
			}

			int ans = 0;
			for(int j=0;j<n;j++){
				int max = Integer.MIN_VALUE;
				for(int i=0;i<n;i++){
					max = Math.max(max,m[i][j]);
				}
				if(mins.contains(max)){
					ans = max;
					break;
				}
			}

			System.out.println(ans);
		}
	}
}