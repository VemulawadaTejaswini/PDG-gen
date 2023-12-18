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
		
        // gcd(x,y)において結合即が成り立つため左右それぞれからのgcdを計算しておく(あとで利用するため)
		L[0]=0;
		R[0]=0;
		for (int i=1; i<n; i++){
		    L[i]=gcd(L[i-1],A[i-1]);
		    R[i]=gcd(R[i-1],A[n-i]);
		}
		
        // どれを入れ替えると最大になるか確認していく
		int gcd=0;
		for (int i=0; i<n; i++){
		    int temp=gcd(L[i], R[n-i-1]);
		    
		    if(gcd<temp){
		        gcd=temp;
		    }
		    
		}
		System.out.println(gcd);
		
    }
}
