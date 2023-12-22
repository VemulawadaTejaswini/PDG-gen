import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
	    Scanner sc=new Scanner(System.in);
	    long mod=1000000007;
	    int n=sc.nextInt();
	    long ans=pow(10,n,mod)-pow(9,n,mod)-pow(9,n,mod)+pow(8,n,mod);
	    System.out.println((ans+mod)%mod);
		
	}
	static long pow(long val,int n,long mod) {
		if(n==0) return 1;
		if(n==1) return val;
		long root=pow(val,n/2,mod);
		root=(root*root)%mod;
		if(n%2!=0) {
			root=root*val;
			root%=mod;
		}
		return root%mod;
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

