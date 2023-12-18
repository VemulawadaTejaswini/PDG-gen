
import java.util.*;

class Main {
    static int N ;
    static int M ;
    static int Q ;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;
    static int[] A;

    static int max = 0 ;
    
  
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        Q = sc.nextInt();
        a = new int[Q];
        b = new int[Q];
        c = new int[Q];
        d = new int[Q];
        A = new int[N];
  
        
        for(int i = 0; i < Q; i++) {
             a[i] = sc.nextInt();
             b[i] = sc.nextInt();
             c[i] = sc.nextInt();
             d[i] = sc.nextInt();
        }
        
        
        array(0);
        System.out.println(max);
        
        
        }
	
	public static void array(int i) {		
		for(int j = 1; j <= M; j++) {
				if(i == 0 || A[i-1] <= j) {
					A[i] = j;		
				
					if(i == N-1) {
						//System.out.print("A = ");
						//for(int n : A) {
							//System.out.print(n + ",");
						//}
						//System.out.println();
						calcSum();
					}else {
						array(i+1);
				}
			}
		}			
	}
	
	public static void calcSum() {
		
		int sum = 0;
		for(int i = 0; i < Q; i++) {
				if(A[b[i]-1]- A[a[i]-1] == c[i]){
					sum += d[i];
				}				
		}
		//System.out.println("sum = " + sum);
		max = Math.max(max, sum);
	}
}
		
	
