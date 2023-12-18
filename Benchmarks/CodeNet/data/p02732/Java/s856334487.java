import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	final static long MOD = 1000000007;
	public static void main(String args[]) throws Exception {
		int n = nextInt();
		int a[] = new int[n];
		HashMap<Integer, Integer> freq = new HashMap<>();
		for(int i=0;i<n;i++) {
			a[i] = nextInt();
			freq.put(a[i],freq.getOrDefault(a[i],0)+1);
		}
		long ans = 0;
		for(int val:freq.values()) {
			ans += val*(val-1)/2;
		}
		StringBuilder sb = new StringBuilder(1<<16);
		for(int i:a) {
			int f = freq.get(i);
			long t = ans - (f-1);
			sb.append(t).append("\n");
		}
		System.out.print(sb);
	}

	static boolean isPal(String n, int l, int u) {
		while(l<u) {
			if(n.charAt(l)!=n.charAt(u))
				return false;
			l++;
			u--;
		}
		return true;
	}

	static int nextInt()throws IOException{
		InputStream in = System.in;
		int ans=0;
		boolean flag=true;
		byte b=0;
		boolean neg=false;
		while ((b>47 && b<58) || flag){
			if(b==45)
				neg=true;
			if(b>=48 && b<58){
				ans=ans*10+(b-48);
				flag=false;
			}
			b=(byte)in.read();
		}
		if(neg)
			return -ans;
		return ans;
	}

	static long nextLong()throws IOException{
		InputStream in=System.in;
		long ans=0;
		boolean flag=true;
		byte b=0;
		while ((b>47 && b<58) || flag){
			if(b>=48 && b<58){
				ans=ans*10+(b-48);
				flag=false;
			}
			b=(byte)in.read();
		}
		return ans;
	}
	static String next()throws Exception{
		StringBuilder sb=new StringBuilder(1<<16);
		InputStream in=System.in;
		byte b=0;
		do{
			if(!isWhiteSpace(b))
				sb.append((char)b);
			b=(byte)in.read();
		}while(!isWhiteSpace(b) || sb.length()==0);
		return sb.toString();
	}
	static boolean isWhiteSpace(byte b){
		char ch=(char)b;
		return ch=='\0' || ch==' ' || ch=='\n';
	}
}