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
			int maxMoves=Integer.MIN_VALUE;
			for(int i=0;i<n-1;i++) {
				int count=0;
				for(int j=i+1;j<n;j++) {
					if(input[j]<=input[j-1]) {
						count++;
					}else {
						break;
					}
				}
				maxMoves=Math.max(maxMoves, count);
			}
			System.out.println(maxMoves);
		}
	}
}