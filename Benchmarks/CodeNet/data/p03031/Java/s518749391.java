import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] sk = new int[10][10];
		int[] k = new int[m];
		int[] p = new int[m];

		for(int i=0;i<m;i++){
			int k2 = sc.nextInt();
			k[i] = k2;
			for(int j=0;j<k2;j++){
				sk[i][j]=sc.nextInt();
			}
		}

		for(int s=0;s<m;s++){
			p[s]=sc.nextInt();
		}

		int num = (int)(Math.pow(2,n));
		int[] sw = new int[n];
		int ans = 0;

		for(int t=0;t<num;t++){
			int nnn = t;
			for(int u=0;u<n;u++){	//スイッチのオンオフ
				sw[u]=nnn%2;
				nnn/=2;
			}
			boolean flg = true;
			for(int v=0;v<m;v++){	//電球
				int count = 0;
				for(int w=0;w<k[v];w++){	//対応スイッチ
					count += sw[sk[v][w]-1];
				}
				if(count%2!=p[v]){
					flg=false;
					break;
				}
			}
			if(flg)ans++;
		}

		// 出力
		System.out.println(ans);
	}
}