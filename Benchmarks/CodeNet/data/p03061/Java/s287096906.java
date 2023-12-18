import java.util.*;

public class Main{
	
	static int gcd(int a, int b){
		if(a<b){
			int temp= a;
			a=b;
			b=temp;
		}
		if(b==0) return a;
		return gcd(a%b,b);
	}
	
	
	public static void main(String []args){
	    Scanner sc= new Scanner(System.in);
	    
		int n=sc.nextInt();
		int[] A = new int [n];
		int[] L = new int [n];
		int[] R = new int [n];
		
		for(int i=0;i<n; i++){
		
		    A[i]=sc.nextInt();
		
		}
		L[0]=A[0];
		R[0]=A[n-1];
		for (int i=1; i<n; i++){
		    L[i]=gcd(L[i-1],A[i]);
		    R[i]=gcd(R[i-1],A[n-i-1]);
		    
		}
		
		int gcd=0;
		
		for (int i=0; i<n; i++){
		    int temp=gcd(L[i], R[i]);
		    
		    if(gcd<temp){
		        gcd=temp;
		    }
		    
		}
		System.out.println(gcd);
		
    }
}