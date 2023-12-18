import java.util.Scanner;
import java.util.Arrays;
 
class Main {
  public static void main(String args[]) {
        Scanner scanner1 = new Scanner(System.in);
       
        int N = scanner1.nextInt();
        int M = scanner1.nextInt();
        
        int A[] = new int[N];
        int B[] = new int[N];
        
        int As[] = new int[N];
        int Bs[] = new int[N];
        
        for(int i = 0;i < N;i++){
        	A[i] = scanner1.nextInt();
        	B[i] = scanner1.nextInt();
        	As[i] = A[i];
        	Bs[i] = B[i];
        }
        
        Arrays.sort(As);
        for(int i = 0;i < N;i++){
        	for(int j = 0;j < N;j++){
        		if(As[i] == A[j]){
        			Bs[i] = B[j];
        		}
        	}
        }
              
        int sumy = 0;
        int sumh = 0;
        int n = 0;
        for(int i = 0;i < N;i++){
        	sumh = sumh + Bs[i];
        	if(sumh >= M){
        		sumy = sumy + As[i]*(M-(sumh-Bs[i]));
        		break;
        	}
        	sumy = sumy + As[i]*Bs[i];
        }
        
        
        System.out.println(sumy);
  }
}