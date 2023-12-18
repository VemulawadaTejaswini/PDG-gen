import java.io.*;
import java.util.*;
import java.math.*;

public class Main{
	static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static int tc;
	static final int MOD=1_000_000_007;
	public static int[] inputArray(String str){
		String[] s=str.split(" ");
		int[] array=new int[s.length];
		for(int i=0;i<s.length;i++) {
			array[i]=Integer.parseInt(s[i]);
		}
		return array;
	}
	public static void main(String[] args)throws IOException {
		//tc=Integer.parseInt(br.readLine());
		tc=1;
		while(tc-->0) {
			int n=Integer.parseInt(br.readLine());
			int[] input=inputArray(br.readLine());
			boolean[] check=new boolean[n];
			Arrays.fill(check, true);
			for(int i=n-2;i>=0;i--) {
				if(check[i+1] && input[i]>=input[i+1]) {
					check[i]=true;
				}else {
					check[i]=false;
				}
			}
			int max=Integer.MIN_VALUE;
			int count=0;
			for(int i=0;i<check.length;i++) {
				if(check[i]) {
					count++;
				}else {
					count=0;
				}
				max=Math.max(count, max);
			}
			System.out.println(count-1);
		}
	}
}