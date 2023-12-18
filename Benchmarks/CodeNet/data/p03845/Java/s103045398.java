import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		
		int A[] =new int[N];
		
		
        
        
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
            count += A[i];
            
        }
        int m = sc.nextInt();
        int P[] =new int[m];
		int M[] =new int[m];
		int ans[] = new int[m];
        for(int i=0;i<m;i++){
            P[i]=sc.nextInt();
            M[i]=sc.nextInt();
            ans[i] = A[P[i] - 1] - M[i];
            
        }
		
		
		for(int i = 0;i < m;i++){
          System.out.println(count - ans[i]);
        }
		
		
		
	}
}
