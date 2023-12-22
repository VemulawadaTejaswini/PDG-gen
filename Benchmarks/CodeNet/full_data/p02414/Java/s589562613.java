import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		//入力
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		int l=Integer.parseInt(st.nextToken());
		int[][] Aary=new int[n][m];
		int[][] Bary=new int[m][l];
		for(int j=0;j<n;j++){
			StringTokenizer sa=new StringTokenizer(br.readLine());
			for(int i=0;i<m;i++){
				Aary[j][i]=Integer.parseInt(sa.nextToken());
			}
		}
		for(int j=0;j<n;j++){
			StringTokenizer sb=new StringTokenizer(br.readLine());
			for(int i=0;i<m;i++){
				Bary[j][i]=Integer.parseInt(sb.nextToken());
			}
		}

		//配列の作成と加工
		int[][] Cary = new int[n][l];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < l; j++) {
				int sum = 0;
				for (int k = 0; k < m; k++) {
					sum += Aary[i][k] * Bary[k][j];
				}
				Cary[i][j] = sum;
			}
		}

		//出力
		for(int j=0;j<n;j++){
			for(int i=0;i<l;l++){
				System.out.print(Cary[j][i]);
			}
			System.out.println();
		}
	}

}

