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
			//System.out.println();
			long[] arr=new long[n];
			long[] pre=new long[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLong();
			}
			pre[0]=arr[0];
			for(int i=1;i<n;i++) {
				pre[i]=pre[i-1]+arr[i];
				//pre[i]%=mod;
			}
			long ans=0;
			for(int i=0;i<n-1;i++) {
				ans+=(arr[i]*((pre[n-1]-pre[i])%mod));
				ans%=mod;
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
