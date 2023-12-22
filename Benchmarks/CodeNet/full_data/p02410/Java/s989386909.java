import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		int n,m;
		int[] b,c;
		int[][] A;
		String[] str;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		A = new int[n][m];
		b = new int[m];
		c = new int[n];
		for(int i=0;i<n;i++){
			str = br.readLine().split(" ");
			for(int j=0;j<m;j++){
				A[i][j] = Integer.parseInt(str[j]);
			}
		}
		for(int i=0;i<m;i++){
			int num = Integer.parseInt(br.readLine());
			for(int j=0;j<n;j++){
				c[j] += A[j][i] * num;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(c[i]);
		}
		br.close();
	}
}