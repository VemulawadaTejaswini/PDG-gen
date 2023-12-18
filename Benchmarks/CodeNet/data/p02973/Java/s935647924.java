import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
		int color = 0;
      
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
      
        for(int i = 0; i < N; i++){
              
            if(A[i] == -1){
                continue;
            }
          
            int max_A = A[i];
            for(int j = 1; j < N-i; j++){
                if(A[i + j] == -1){
                    continue;
                }
              
                if(A[i + j] > max_A){
                    max_A = A[i + j];
                    A[i + j] = -1;
                }
            }
          
            color++;
        }
        
        System.out.println(color);
    }
}