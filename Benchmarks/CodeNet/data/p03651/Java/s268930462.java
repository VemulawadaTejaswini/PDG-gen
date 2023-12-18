import java.util.*;
import java.io.*;

public class Main {
	
	public static long gcd(long x, long y){//only when x>0,y>0
		if(x>y) return gcd(y,x);
		//x<=y
		if(y%x==0) return x;
		else return gcd(x,y%x);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] a = new long[N];
        long max = 0L;
        for(int i=0;i<N;i++){
        	a[i]=sc.nextLong();
        	if(a[i]>max) max=a[i];
        }
        if(max<K){
        	System.out.println("IMPOSSIBLE");	
        	System.exit(0);
        }
        long min = a[0];
        for(int i=1;i<N;i++){
        	if(min>a[i]) min=a[i];
        	if(min>gcd(min,a[i])) min = gcd(min,a[i]);
        }
        
        if(K%min==0) System.out.println("POSSIBLE");
        else System.out.println("IMPOSSIBLE");
    }
}