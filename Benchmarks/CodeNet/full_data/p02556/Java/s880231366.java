
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class Main {

	public static final int mod=1000000007;
	public static void main(String[] args) throws IOException {
		
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		//Scanner sc=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Integer.parseInt(sc.readLine());
		Pair[] arr=new Pair[n];
		for(int i=0;i<n;i++) {
			String[] ip=sc.readLine().split(" ");
			long x=Long.parseLong(ip[0]);
			long y=Long.parseLong(ip[1]);
			arr[i]=new Pair(x,y);
		}
		Arrays.sort(arr,(a,b)->(int)((a.x-b.x)%mod+(a.y-b.y)%mod)%mod);
		long ans=Math.abs(arr[0].x-arr[n-1].x)+Math.abs(arr[0].y-arr[n-1].y);
		System.out.println(ans);
		out.flush();
		out.close();
	}
	
	
	public static int gcd(int A, int B) {
	    if(B==0)
	        return A;
	    else
	        return gcd(B, A % B);
	}
	
	public static class Pair{
		long x=0;
		long y=0;
		Pair(long a,long b){
			x=a;
			y=b;
		}		
	}
	
}

