import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		Reader reader=new Reader();
		int t=1;//sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			long mod=(long)1e9+7;
			//System.out.println(mod);
			long[] arr=new long[n];
			long[] suff=new long[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLong();
			}
			suff[n-1]=arr[n-1];
			for(int i=n-2;i>=0;i--) {
				suff[i]=suff[i+1]+arr[i];
				suff[i]%=mod;
			}
			long ans=0;
			for(int i=0;i<n-1;i++) {
				ans=(ans+arr[i]*1l*(suff[i+1]))%mod;
				//ans%=mod;
			}
			System.out.println(ans);
		}
	}
}
class Reader{
	BufferedReader reader;
	Reader(){
		reader=new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() throws IOException{
		String in=reader.readLine().trim();
		return Integer.parseInt(in);
	}
	long nextLong() throws IOException{
		String in=reader.readLine().trim();
		return Long.parseLong(in);
	}
	String next() throws IOException{
		return reader.readLine().trim();
	}
	String[] stringArray() throws IOException{
		return reader.readLine().trim().split("\\s+");
	}
	int[] intArray() throws IOException{
		String[] inp=this.stringArray();
		int[] arr=new int[inp.length];
		int i=0;
		for(String s:inp) {
			arr[i++]=Integer.parseInt(s);
		}
		return arr;
	}
}
