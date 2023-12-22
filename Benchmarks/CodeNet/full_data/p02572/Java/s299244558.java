import java.util.*;
import java.io.*;
public class Main {

	static Scanner inp= new Scanner(System.in);
	static PrintWriter out= new PrintWriter(System.out);
	public static void main(String args[]) {		    	
	   	Main g=new Main();
	   	g.main();
	   	out.close();
	}

	
	
	//Main
	void main() {
		
		long mod=(long)1e9+7;
		int n=inp.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=inp.nextLong();
		}
		long post[]=new long[n];
		post[n-1]=a[n-1];
		long gg=0;
		for(int i=n-2;i>=0;i--) {
			post[i]=post[i+1]+a[i];
		}
		for(int i=0;i<n-1;i++) {
			gg+=(a[i]*post[i+1])%mod;
			gg%=mod;
		}
		System.out.println(gg);
	}
    
    
		
}
