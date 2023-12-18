import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		new ABC133().c();
	}
}

class ABC133{
		void c(){
				long L, R;
				long M = 2019L;
				Scanner in = new Scanner(System.in);
				L = in.nextLong();
				R = in.nextLong();
				int ans = 2018;
				long maxI = (long)Math.min(R, L+M);
				for(long i=L; i<=maxI; ++i){
						long maxJ = (long)Math.min(R, i+1L+M);
						for(long j=i+1; j<=maxJ; ++j){
								ans = (int)Math.min(ans, i*j%M);
						}
				}
				System.out.println(ans);
				in.close();
		}
}
