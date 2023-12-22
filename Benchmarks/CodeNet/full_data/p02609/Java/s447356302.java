import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.nextInt();
		char[] X = sc.next().toCharArray();
		
		int pop = popcount(X);
		int[] baseMod1 = new int[N];
		int[] baseMod2 = new int[N];
		for(int i=N-1; i>=0; i--) {
			if(pop+1<=N)
				baseMod1[i] = (i==N-1 ? 1 : baseMod1[i+1]*2)%(pop+1);
			if(pop-1>0)
				baseMod2[i] = (i==N-1 ? 1 : baseMod2[i+1]*2)%(pop-1);
		}
		
		int mod1 = 0;
		int mod2 = 0;
		for(int i=0; i<N; i++) {
			if(pop+1<=N)
				mod1 = (mod1 + (X[i]-'0')*baseMod1[i])%(pop+1);
			if(pop-1>0)
				mod2 = (mod2 + (X[i]-'0')*baseMod2[i])%(pop-1);
		}
		
		for(int i=0; i<N; i++) {
			if(X[i]=='0') {
				pw.println(1 + f((mod1+baseMod1[i])%(pop+1)));
			} else {
				pw.println(pop==1 ? 0 : 1 + f(((mod2-baseMod2[i]+pop-1))%(pop-1)));
			}
		}
		
		pw.close();
		sc.close();
	}
	
	static int f(int x) {
		int ans = 0;
		while(x>0) {
			x = x%popcount(x);
			ans++;
		}
		return ans;
	}
	
	static int popcount(int x) {
		int ans = 0;
		while(x>0) {
			ans += x&1;
			x>>=1;
		}
		return ans;
	}
	
	static int popcount(char[] x) {
		int ans = 0;
		for(char c : x)
			if(c=='1')
				ans++;

		return ans;
	}
}
