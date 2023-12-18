import java.util.*;
import java.io.*;

public class Main {
	
	static long[] values;
	static long[] weights;
	static long w;
	static long n;
	static long best=0;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		w=sc.nextInt();
		weights=new long[(int)n];
		values=new long[(int)n];
		
		for(int i=0;i<n;i++) {
			weights[i]=sc.nextInt();
			values[i]=sc.nextInt();
		}
		
		rec(0,w,0);
		
		System.out.println(best);
	
	
	}
	
	public static void rec(long i,long rem,long sum) {
		
		
		if(sum>best) {
			best=sum;
		}
		
		if(i>=n) {
			return;
		}
		
		if(rem-weights[(int)i]>=0)
			rec(i+1,rem-weights[(int)i],sum+values[(int)i]);  //take
		
		rec(i+1,rem,sum);  //leave
		
		
	}
	
}
