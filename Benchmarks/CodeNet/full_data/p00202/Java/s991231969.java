import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    static int[] prime, map, check;
    static int n, x, sum;
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    prime = new int[1000001];
	    sieve();
	    while(true){
		String[] st = sc.readLine().split(" ");
		n = Integer.valueOf(st[0]);
		x = Integer.valueOf(st[1]);
		if(n==0 && x==0)
		    break;
		map = new int[n];
		for(int i=0; i<n; i++)
		    map[i] = Integer.valueOf(sc.readLine());
		check = new int[x+1];
		sum = 0;
		solve();
		String out = "NA";
		for(int i=x; i>=0; i--)
		    if(check[i]==1 && prime[i]==0){
			out = String.valueOf(i);		
			break;
		    }
		System.out.println(out);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    static void solve(){
	check[0] = 1;
	for(int i=0; i<=x; i++)
	    if(check[i]==1)
		for(int j=0; j<n; j++)
		    if(i+map[j]<=x)
			check[i+map[j]] = 1;
    }
    static void sieve(){
	prime[0] = 1; prime[1] = 1;
	for(int i=2; i<1000; i++)
	    if(prime[i]==0)
		for(int j=i*i; j<1000000; j+=i)
		    prime[j] = 1;
    }
}