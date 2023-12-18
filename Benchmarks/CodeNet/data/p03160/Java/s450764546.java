import java.util.*;
import java.lang.*;
import java.io.*;


public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split("\\s");
		int[] arr = new int[N];
		for(int i=0;i<N;++i) arr[i] = Integer.parseInt(s[i]);
		System.out.println(solve(arr,N));
	}
	
	private static int solve(int[] arr,int N){
		int last = 0,second_last = 0;
	    second_last = Math.abs(arr[N-1] - arr[N-2]);
		for(int i=N-3;i>=0;--i){
			int temp = second_last;
			second_last = Math.min(second_last + Math.abs(arr[i] - arr[i+1]),last + Math.abs(arr[i] - arr[i+2]));
			last = temp;
		}
		
		return second_last;
	}
}