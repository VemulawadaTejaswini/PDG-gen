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
		int min=(L*R)%2019;
		for(int i=L;i<R-1;i++) {
			for(int j=i+1;j<R;j++) {
				if((i*j)%2019<min) {
					min=(i*j)%2019;
				}
			}
			
		}
		System.out.println(min);
		
		
		
		
		
		
		
		
	
		
		
}
}

