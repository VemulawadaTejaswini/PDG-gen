import java.io.*;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		StringTokenizer s = new StringTokenizer(in.readLine(), " ");
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(s.nextToken());
		
		int c = 0;
		int e = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if(a[i] > a[i + 1]){
				if(e == -1){
					c++;
					e = 0;
				}
				else if(e == 0) e = 1;
			}
			else if(a[i] < a[i + 1]){
				if(e == 1){
					c++;
					e = 0;
				}
				else if(e == 0) e = -1;
			}
		}
		
		c++;
		
		System.out.println(c);
				
	}
}
