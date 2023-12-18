import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static long l=0,l2=0;
	public static void main(String[] args) throws IOException {
		l = System.currentTimeMillis();
		new Main().exec();
		l2 = System.currentTimeMillis();
		
	}

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int N = (int)in.nextInt();
		long[] T= in.nextLong(new long[N],N);
		if(N==1)
			out.println(T[0]);
		else
			out.println(getLcm(T));
		out.flush();
	}
	private long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
	}
	private long lcm(long a, long b){
		return a / gcd(a, b) * b;
	}
//	private long getGcd(long a, long b){
//		if(a<b)
//			return getGcd(b,a);
//		long tmp = 0;
//		while (a%b!=0) {
//			tmp = b;
//			b = a%b;
//			a = tmp;
//		}
//		return b;
//	}
//	
//	private long getLcm(long a, long b){
//		if(a<b)
//			return getLcm(b,a);
//		long gcd = getGcd(a,b);
//		return (a/gcd)*b;
//	}
	
	private long getLcm(long[] T) {
		long ans = 0;
		for(int i=1; i<T.length; i++) {
			ans = lcm(((ans == 0)?T[i-1]:ans),T[i]);
		}
		return ans;
	}
}




class InputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int nextInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    
    public long[] nextLong(long[] a, int num) throws NumberFormatException, IOException{
        int i=0;
        while(i<num) {
            for(String s: br.readLine().split(" ")){
            	if(i<num) {
                    a[i++] = Long.parseLong(s);
            	}
            }
        }
        return a;
    }

}