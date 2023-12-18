import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static BufferedReader reader;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(readLine());
		long[] A = new long[N];
		String[] s = readLine().split(" ");
		for(int i=0;i<N;i++){
			A[i] = Long.parseLong(s[i]);
		}
		long gcd = A[0];
		for(int i=1;i<N;i++){
			gcd = gcd(gcd,A[i]);
		}
		System.out.println(gcd);
		return;
	}

	private static String readLine(){
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
	
	private static long gcd(long a, long b){
		if(b==0){return a;}
		if(a==b){return a;}
		if(a<b){return gcd(b,a);}
		return gcd(b,a%b);
	}
}
