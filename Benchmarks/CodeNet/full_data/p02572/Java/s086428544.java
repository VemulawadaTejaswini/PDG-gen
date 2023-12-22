import java.io.BufferedReader;
import java.util.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;

 
public class Main {
	final static Long MOD = (int)1e9+7L; 
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int n = fs.nextInt();
		Long [] pref = new Long[n];
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = fs.nextInt();
		}
		for(int i=n-1;i>=0;i--){
			if(i==n-1)
				pref[i]=0L;
			else {
				pref[i] = (pref[i+1]+a[i+1])%MOD;
			}
		}
		Long ans = 0L;
		for(int i=0;i<n;i++) {
			ans = (ans + (pref[i]*a[i])%MOD)%MOD;
		}
	  System.out.println(ans);
	}
	static final Random random=new Random();
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}
 
	
}