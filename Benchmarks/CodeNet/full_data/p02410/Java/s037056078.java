//Accepted
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	static StringBuilder sb=new StringBuilder();
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[2];
		int n;
		int m;

		
		//入力
		try {
			//sample=Integer.parseInt(br.readLine());
			//nとmの入力
			work=br.readLine().split("\\s+");
			n=Integer.parseInt(work[0]);
			m=Integer.parseInt(work[1]);

			int[][] A=new int[n][m];
			int[] b=new int[m];
			
			//Aの入力
			String work2[]=new String[m];
			for(int x=0; x<n; x++) {
				work2=br.readLine().split("\\s+");
				for(int y=0; y<m; y++) {
					A[x][y]=Integer.parseInt(work2[y]);
				}
			}

			//bの入力
			for(int i=0; i<m; i++) {
				b[i]=Integer.parseInt(br.readLine());
			}
			
			//計算処理
			for(int x=0; x<n; x++) {
				int sum=0;
				for(int y=0; y<m; y++) {
					sum += A[x][y]*b[y];
				}
				sb.append(sum);
				sb.append(String.format("%n", ""));
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//出力
		System.out.print(sb);
	}
	
}
