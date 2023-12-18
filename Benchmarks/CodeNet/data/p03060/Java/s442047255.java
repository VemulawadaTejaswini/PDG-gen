import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {

	static FastReaderR in = new FastReaderR(System.in) ;
	
	static int N,index ;
	
	static int V[] = new int[21] , C[] = new int[21] ; 
	
	static int mmax = Integer.MIN_VALUE ;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		N = in.nextInt() ;
		for(int i=0;i<N;i++){
			V[i] = in.nextInt() ;
		}
		for(int i=0;i<N;i++){
			C[i] = in.nextInt() ;
		}
		f(N-1,0) ;
		System.out.println(mmax);
	}
	
	public static void f(int dp,int now){
		if(dp==-1){
			if(now>mmax){
				mmax = now ;
			}
		}else{
			f(dp-1,now+(V[dp]-C[dp])) ;
			f(dp-1,now) ; 
		}
	}

}
class FastReaderR {
    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;
 
    FastReaderR(InputStream is) {
        in = is;
    }
    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }
    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan());
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }
}