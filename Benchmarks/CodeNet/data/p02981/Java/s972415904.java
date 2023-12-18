



import java.util.Scanner;

public class Main{
	
	private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),A=sc.nextInt(),B=sc.nextInt();
		if(N*A<=B) {
			System.out.println(N*A);
		}else {
			System.out.println(B);
		}
		
		
		
		
		
		
		
		
		
		
	
		
		
}
}


