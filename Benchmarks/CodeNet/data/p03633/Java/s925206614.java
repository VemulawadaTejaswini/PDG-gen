
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(sc.next());
		long t[] = new long[N];
		for(int i=0;i<N;i++){
			t[i] = Long.parseLong(sc.next());
		}
		long tmp = 1;
		for(int i=0;i<N;i++){
			long gcd = gcd(tmp,t[i]);
			tmp = Math.max(tmp,t[i])/gcd * Math.min(tmp,t[i]);
		}

		out.println(tmp);
		
		sc.close();
		out.flush();
	}

	public static long gcd(long a, long b){
		long r = a % b;
		if(r==0){
			return b;
		}
		else{
			return gcd(b,r);
		}
	}
}