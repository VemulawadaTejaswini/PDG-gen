import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		
		long[] yarra = new long[N];
		String[] split = br.readLine().split(" ");
		
		for(int i = 0; i < yarra.length; i++)
			yarra[i] = Long.parseLong(split[i]) - i - 1;
		
		Arrays.sort(yarra);
		long min = yarra[0];
		long max = yarra[N - 1];
		
		long left = -1, right = N;
		long mid = -1;
		
		while(right - left >= 2) {
			mid = (left + right)/2;
			long val = 0;
			long val2 = 0;
			for(int i = 0; i < yarra.length; i++) {
				val += (long) Math.abs(yarra[i] - mid);
				val2 += (long) Math.abs(yarra[i] - (mid-1));
			}
			
			if(val2 < val)
				right = mid;
			else
				left = mid;
		}
		
		long val = 0;
		long val2 = 0;
		long val3 = 0;
		long val4 = 0;
		long val5 = 0;
		
		left = Math.max(left, 0);
		right = Math.min(right, N-1);
		
		for(int i = 0; i < yarra.length; i++) {
			val += (long) Math.abs(yarra[i] - left);
			val2 += (long) Math.abs(yarra[i] - mid);
			val3 += (long) Math.abs(yarra[i] - right);
			val4 += (long) Math.abs(yarra[i] - min);
			val5 += (long) Math.abs(yarra[i] - max);
		}
		pw.println(Math.min(val, Math.min(val2, Math.min(val3, Math.min(val4, val5)))));
		
		pw.close();
	}
}





