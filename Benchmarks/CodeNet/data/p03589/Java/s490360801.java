import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if(N%4==0){
			System.out.println(N*3/4+" "+N*3/4+" "+N*3/4);
		}else if(N%2==0){
			System.out.println(N/2+" "+N+" "+N);
		}else{
			long h = (long)(Math.ceil((double)N/4.0));
			double amari = ((double)N*(double)h)/(4.0*(double)h-(double)N);
			long n = (long)(Math.ceil(amari));
			amari = ((double)N*(double)n*(double)h) / (4.0*(double)h*(double)n - ((double)h+(double)n)*(double)N);
			long w = (long)(Math.ceil(amari));
			System.out.println(h+" "+n+" "+w);			
		}
		return;
	}
}