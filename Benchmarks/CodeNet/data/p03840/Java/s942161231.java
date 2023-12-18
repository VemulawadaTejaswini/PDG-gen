import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int[] fig = new int[7];
		int rta = 0;
		for (int i = 0; i < fig.length; i++) {
			fig[i] = Integer.parseInt(stk.nextToken());
		}
		
		int temp = Math.min(Math.min(fig[0], fig[4]), fig[3]);
		rta+=temp*6;
		fig[0] -= temp;
		fig[4] -= temp;
		fig[3] -= temp;
		rta += (fig[0]/2)*4;
		rta += fig[1]*2;
		rta += (fig[3]/2)*4;
		rta += (fig[4]/2)*4;
		
		System.out.println(rta/2);
	}
}
