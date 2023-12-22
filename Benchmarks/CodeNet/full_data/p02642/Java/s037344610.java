import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	static int[] factorOf=new int[1_000_001];
	
	public static void main(String[] args) {
		precomp();
//		for (int i=1; i<=1_000_000; i++) {
//			ArrayList<Integer> one=allFactors(i);
//			ArrayList<Integer> two=allFactorsNaive(i);
//			System.out.println(one+" "+two);
//			Collections.sort(one);
//			for (int j=0; j<one.size(); j++) 
//				if (one.get(j)!=(int)two.get(j)) {
//					System.out.println(i);
//					System.out.println(one);
//					System.out.println(two);
//					throw null;
//				}
//		}
		FastScanner fs=new FastScanner();
		int n=fs.nextInt();
		int[] a=fs.readArray(n);
		int[] counts=new int[1_000_001];
		for (int i:a) {
			counts[i]++;
		}
		int ans=0;
		outer: for (int i:a) {
			counts[i]--;
			for (int fact:allFactors(i)) if (counts[fact]!=0) {
				counts[i]++;
				continue outer;
			}
			counts[i]++;
			ans++;
		}
		System.out.println(ans);
	}
	
	static void precomp() {
		for (int i=2; i<factorOf.length; i++) {
			if (factorOf[i]!=0) continue;
			for (int j=i; j<factorOf.length; j+=i)
				factorOf[j]=i;
		}
	}
	
	static ArrayList<Integer> allFactors(int n) {
		if (n==1) {
			ArrayList<Integer> res=new ArrayList<>();
			res.add(1);
			return res;
		}
		ArrayList<Integer> primes=new ArrayList<>(), counts=new ArrayList<>();
		int cur=n;
		while (cur!=1) {
			int fact=factorOf[cur];
			int times=0;
			while (cur%fact==0) {
				times++;
				cur/=fact;
			}
			primes.add(fact);
			counts.add(times);
		}
		ArrayList<Integer> ans=new ArrayList<>();
		int[] used=new int[counts.size()];
		int prod=1;
		outer: while (true) {
			int index=0;
			used[index]++;
			prod*=primes.get(index);
			while (used[index]>counts.get(index)) {
				if (index+1==counts.size()) break outer;
				for (int i=0; i<used[index]; i++) prod/=primes.get(index);
				used[index]=0;
				used[index+1]++;
				prod*=primes.get(index+1);
				index++;
			}
			ans.add(prod);
		}
		ans.add(1);
		return ans;
	}
	
	static ArrayList<Integer> allFactorsNaive(int n) {
		ArrayList<Integer> res=new ArrayList<>();
		for (int i=1; i<=n; i++) if (n%i==0) {
			res.add(i);
		}
		return res;
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
