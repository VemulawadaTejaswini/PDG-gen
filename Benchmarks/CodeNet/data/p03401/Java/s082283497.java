import static java.lang.Math.abs;
import java.util.Scanner;


/**
 *
 * @author must
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        
        for (int i=0;i<N;i++){
            int sum=0;
            for (int k=0;k<N;k++){
                if(i!=k){
                    if(sum==0){
                        sum+=abs(A[k]);
                        if(i!=k+1){
                            sum+=abs(A[k+1]-A[k]);
                        }else{
                            sum+=abs(A[k+2]-A[k]);
                        }
                    }else if(i!=N-1 && k==N-1){
                        sum+=abs(A[k]);
                    }else if(i==N-1 && k==N-2){
                        sum+=abs(A[k]);
                    }else{
                        if(i!=k+1){
                            sum+=abs(A[k+1]-A[k]);
                        }else{
                            sum+=abs(A[k+2]-A[k]);
                        }
                    }
                }
            }
            System.out.println(sum);
        }
     }
    
}
