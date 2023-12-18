import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tok = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(tok.nextToken());
		int M = Integer.parseInt(tok.nextToken());
		int size[] = new int[N]; Arrays.fill(size, 1);
		boolean rojos[] = new boolean[N];
		rojos[0] = true;
		for (int i = 0; i < M; i++) {
			tok = new StringTokenizer(in.readLine());
			int f = Integer.parseInt(tok.nextToken()) - 1;
			int t = Integer.parseInt(tok.nextToken()) -1;
			size[f] -= 1;
			size[t] += 1;
			if(rojos[f]) rojos[t] = true;
			if(size[f] == 0) rojos[f] = false;
		}
		
		int c = 0;
		for (int i = 0; i < rojos.length; i++) if(rojos[i])c++;
		System.out.println(c);
	}
}
