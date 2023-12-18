import java.util.*;

public class Main{
	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
	    long[] array = new long[n];
	    long ans=-1;
	    for(int i=0;i<n;i++){   
		array[i]=scanner.nextLong();
	    }
	    for(int i=0;i<n-1;i++){
		array[i+1]=(lcm(array[i],array[i+1]));
	    }
	    ans = array[n-1];
		System.out.println(ans);
	}
private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}