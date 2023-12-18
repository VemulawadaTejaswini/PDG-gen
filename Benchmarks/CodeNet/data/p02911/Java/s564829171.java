import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int Q = scanner.nextInt();
        
        int [] A = new int [Q];
        int [] B = new int [N];
        
        for(int k =0; k<N; k++){
            B[k]=K;
        }
        
        for(int i =0; i<Q; i++){
            A[i] = scanner.nextInt()-1;
            for(int j = 0; j<N; j++){
                if(A[i] != j){
                   B[j] = B[j]-1; 
                }
            }
        }
           
        for (int l=0; l<N; l++){
            if(B[l]>0){
            System.out.println("Yes");
        }
            else{
                System.out.println("No");
            }
        }
    }    
}