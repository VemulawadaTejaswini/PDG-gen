import java.util.*;

public class Main{
	public static void main(String args[]){
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
      
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < N; i++){
            int max = 0;
          
            for(int j = 0; j < N; j++){
                if(A[j] > max && i != j){
                    max = A[j];
                }
            }
            
            System.out.println(max);
        }
    }
}