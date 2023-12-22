import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int max(int[] a){
		int ans = 0;
		for(int i=0;i<a.length;i++){
			if(ans < a[i]){
				ans = a[i];
			}
		}
		return ans;
	}


	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String stra = br.readLine();
			if (stra == null){break;}
			String strb = br.readLine();
			int n = stra.length();
			int m = strb.length();
			int[][] mapp = new int [n+1][m+1];
			for(int i=0; i<n; i++){
				for(int j=0;j<m; j++){
					if (stra.charAt(i) == strb.charAt(j)){
						mapp[i+1][j+1] = mapp[i][j] + 1;
					}
				}
			}

			int ans = 0;
			for (int i=0; i<n+1; i++){
				ans = Math.max(ans, max(mapp[i]));
			}
			System.out.println(ans);
		}
	}
}