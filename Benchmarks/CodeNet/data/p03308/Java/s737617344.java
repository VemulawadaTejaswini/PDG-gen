import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		
		int[] yarra = new int[N];
		String[] split = br.readLine().split(" ");
		long max = -1;
		long min = 1000000001;
		for(int i = 0; i < yarra.length; i++) {
			long x = Long.parseLong(split[i]);
			max = Math.max(max, x);
			min = Math.min(min, x);
		}
		pw.println(max - min);
		
		pw.close();
	}
}