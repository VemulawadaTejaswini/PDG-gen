import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i,m,max,min;
		long sum;
		int[] n = new int[990000];
		String[] str = new String[990000];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		m = Integer.parseInt(str[0]);
		str = in.readLine().split(" "); 
		sum = max = min = Integer.parseInt(str[0]);
		for(i=1;i<m;i++){
			n[i] = Integer.parseInt(str[i]);
			max = Math.max(max,n[i]);
			min = Math.min(min,n[i]);
			sum += n[i];
		}
		System.out.println(min+" "+max+" "+sum);
	}
}