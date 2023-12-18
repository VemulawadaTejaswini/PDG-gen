import java.util.Scanner;

public class Main{
		
	public static void main(String args[]){
		  
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    int ri[] = new int[n];
	    int le[] = new int[n];
	    
	    for(int i = 0; i < n; i++) {
	    	a[i] = sc.nextInt();
	    }
	    
	    int ans = 0;
	    le[0] = 0;
	    for(int i = 1; i < n; i++) {
	    	le[i] = gcd(le[i-1], a[i-1]);
	    }
	    
	    ri[n-1] = 0;
	    for(int i = n-2; i >= 0; i--) {
	    	ri[i] = gcd(ri[i+1], a[i+1]);
	    }
	    
	    for(int i = 0; i < n; i++) {
	    	ans  = Math.max(ans, gcd(le[i], ri[i]));
	    }
	    
	    System.out.println(ans);
	}
	  
	public static int gcd(int n, int m) {
		if(m == 0) {
			return n;
		}else {
			return gcd(m, n%m);
		}
	}
}