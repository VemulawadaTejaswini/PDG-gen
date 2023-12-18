import java.util.*;

	
	public class Main {
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// get a integer
			int N = sc.nextInt();
			int f= 1, U = 1000000007;
			int q = N/U, r=N%U;
	        for(int i=1; i<=r; i++){
	            f=(f*i)% U;
	        }
	        int M =1;
	        for (int i=1; i<=U; i++){
	        	M=(M*i)%U;
	        }
	        /*for (int i=1; i<=q;i++){
	        	f=(f*M)%U;
	        }*/
	        f=f*pow(M, q, U);
	        System.out.println(f);
		}
		public static int pow(int M, int q, int U){
			if (q==0) return 1;
			if (q==1) return M % U;
			int h = pow(M, q/2,U);
			if(q%2==0){
				
				return (h*h)%U;
			}else{
				return (h*h*M)%U;
			}
		}
	}