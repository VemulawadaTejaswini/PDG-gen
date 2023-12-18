import java.util.Scanner;

public class Main{
	
	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt(),R=sc.nextInt();
		int min=(L*(L+1))%2019;
		System.out.println(min);
		
		
		
		
		
		
		
		
	
		
		
}
}


