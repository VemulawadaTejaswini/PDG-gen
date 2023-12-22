import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int an=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());

		//配列作成
		//行列A
		int[][] Aary=new int[an][m];
		for(int y=0;y<an;y++) {
			for(int x=0;x<m;x++) {
				Aary[y][x]=0;
			}
		}
		//ベクトルb
		int[] Bary=new int[m];
		for(int x=0;x<m;x++) {
			Bary[x]=0;
		}

		//配列の数値入力
		//A
		for(int y=0;y<an;y++) {
			StringTokenizer sa=new StringTokenizer(br.readLine());
			for(int x=0;x<m;x++) {
				int a=Integer.parseInt(sa.nextToken());
				Aary[y][x]=a;
			}
		}
		//b
		for(int x=0;x<m;x++) {
			StringTokenizer sb=new StringTokenizer(br.readLine());
			int b=Integer.parseInt(sb.nextToken());
			Bary[x]=b;
		}

		//配列の加工
		int c=0;
		for(int y=0;y<an;y++) {
			for(int x=0;x<m;x++) {
				c=c+Aary[y][x]*Bary[x];
			}
			System.out.println(c);
			c=0;
		}

		//配列出力・デバッグ
		/*for(int y=0;y<an;y++) {
			for(int x=0;x<m;x++) {
				System.out.print(Aary[y][x]);
			}
			System.out.println("");
		}*/
	}

}

