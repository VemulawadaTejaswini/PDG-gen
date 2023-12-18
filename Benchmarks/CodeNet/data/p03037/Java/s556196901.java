import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		new ABC127().c();
	}
}

class ABC127{
	void c(){
		int N, M;
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		M = in.nextInt();
		int[] s = new int[N+2];
		for(int i=0; i<M; ++i){
			//[L,R] -> [L, R+1)
			int L = in.nextInt();
			int R = in.nextInt();
			s[L]++;
			s[R+1]--;
		}
		int ans = 0;
		for(int i=1; i<N+2; ++i){
			s[i] += s[i-1];
			if(s[i] == M){
				ans++;
			}
		}
		System.out.println(ans);
		in.close();
	}
}
