import java.util.*; 
import java.lang.*; 


public class Main{
    
      public static long func( long n, long M, long X, ArrayList<Long> a){
            if(n==1){
                a.add(X);
                return X;
            }else{
                long p = func(n-1, M, X, a);
                long ans = (p*p)%M;
                a.add(a.get(0)+ans);
                a.remove(a.get(0));
                return ans;
            }               
        }
    
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long N = scan.nextLong();
                long X = scan.nextLong();
                long M = scan.nextLong();

                ArrayList<Long> a = new ArrayList<>();
                
                func(N, M, X, a);
  
                System.out.println(a.get(0));

        }
}