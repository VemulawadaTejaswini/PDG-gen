import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static long mod=1_000_000_007;
	
	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int n=fs.nextInt(), k=fs.nextInt();
		int[] a=fs.readArray(n);
		sort(a);
		if (k==n) {
			long prod=1;
			for (int i:a) prod=mul(prod, i);
			print(prod);
			return;
		}
		boolean havePos=false;
		for (int i:a) if (i>=0) havePos=true;
		if (!havePos) {
			long prod=1;
			if (k%2==0) {
				//ans == pos
				for (int i=0; i<k; i++) prod=mul(prod, a[i]);
			}
			else {
				//ans == neg
				for (int i=0; i<k; i++) prod=mul(prod, a[n-i-1]);
			}
			print(prod);
			return;
		}
		
		//we know we can make it positive
		int nNegs=0;
		for (int i:a) if (i<0) nNegs++;
		
		int[] pos=new int[n-nNegs], negs=new int[nNegs];
		int pIndex=n-nNegs-1, nIndex=0;
		for (int i=0; i<n; i++) {
			if (a[i]>=0) pos[pIndex--]=a[i];
			else negs[nIndex++]=a[i];
		}

		long[] posCS=new long[pos.length+1], negCS=new long[negs.length+1];
		posCS[0]=negCS[0]=1;
		for (int i=1; i<=pos.length; i++) posCS[i]=mul(posCS[i-1], pos[i-1]);
		for (int i=1; i<=negs.length; i++) negCS[i]=mul(negCS[i-1], negs[i-1]);
		
		int nPos=Math.min(pos.length, k);
		int nNeg=k-nPos;
		if (nNeg%2==1) {
			nNeg++;
			nPos--;
		}
		while (nNeg+2<=nNegs && nPos>=2 && 
				pos[nPos-1]*(long)pos[nPos-2] < negs[nNeg]*(long)negs[nNeg+1]) {
			nPos-=2;
			nNeg+=2;
		}
		print(mul(posCS[nPos], negCS[nNeg]));
	}
	
	static void print(long a) {
		System.out.println((a%mod+mod)%mod);
	}
	
	static long mul(long a, long b) {
		return a*b%mod;
	}
	
	static void sortAbs(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l, (aa, b)-> {
			return -Integer.compare(Math.abs(aa), Math.abs(b));
		});
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
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
