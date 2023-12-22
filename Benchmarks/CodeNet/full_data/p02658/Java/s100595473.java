import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long [] A = new long [N];
        long number = 1;
        long max = 1000000000000000000L;
        
        for(int i=0; i<N; i++){
            A[i] = scanner.nextLong();
        }
        
        for(int i = 0; i<N; i++){ 
         
        if(A[i] ==0){
                number = 0;
                break;
            }
            else if(A[i]<=(max/number)){
                number *= A[i];
            }
            else{
                number = -1;
            }
        }
            
            System.out.println(number);
        
    }
}