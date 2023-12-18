import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static int[] l,r;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
			
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			String[] str1 = br.readLine().split(" ");
			a[i] = Integer.parseInt(str1[0]);
			b[i] = Integer.parseInt(str1[1]);
		}
		int[] c = new int[m];
		int[] d = new int[m];
		for(int i = 0; i < m; i++){
			String[] str1 = br.readLine().split(" ");
			c[i] = Integer.parseInt(str1[0]);
			d[i] = Integer.parseInt(str1[1]);
		}

		int[] x = new int [n];
		int[] y = new int [n];
		Arrays.fill(x,Integer.MAX_VALUE);
		Arrays.fill(y,Integer.MAX_VALUE);
		for(int i = 0; i < n; i++){
			int nx = Math.abs(a[i] - x[i]);
			int ny = Math.abs(b[i] - y[i]);
			for(int j = 0; j < m; j++){
				int tx = Math.abs(a[i] - c[j]);
				int ty = Math.abs(b[i] - d[j]);
				if(nx+ny > tx+ty){
					x[i] = c[j];
					y[i] = d[j];
					nx = tx;
					ny = ty;
				}
			}
			sb.append(x[i]).append(' ').append(y[i]).append("\n");
		}

		System.out.println(sb);
	}
}
