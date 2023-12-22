import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m) == 0) break;
			char [][] data = new char[n][m];
			for(int i = 0; i < n; i++){
				String s = sc.next();
				data[i] = s.toCharArray();
			}
			int [][] acc = new int[n][m];
			for(int i = 0; i < n; i++){
				acc[i][m-1] = (data[i][m-1] == '.' ? 1 : 0);
				for(int j = m - 2; j >= 0; j--){
					if(data[i][j] == '.'){
						acc[i][j] = acc[i][j+1] + 1;
					}
					else{
						acc[i][j] = 0;
					}
				}
			}
			
			int ans = 0;
			for(int i = 0; i < n; i++){
				for(int j = 0; j < m; j++){
					int minw = acc[i][j];
					for(int k = 0; i + k < n; k++){
						minw = Math.min(minw, acc[i+k][j]);
						int res = (k + 1) * minw;
						ans = Math.max(ans, res);
					}
				}
			}
			System.out.println(ans);
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}