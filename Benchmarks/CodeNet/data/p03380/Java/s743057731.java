import java.util.Arrays;
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
        int n = sc.nextInt();
        int[] A = new int[n];
        
        for (int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        
        int mm = A[n-1];
        
        double center = mm/2.0;
        
        int t=0;
        for(int i=0;i<n-1;i++){
            if(center < A[i]){
                t=i;
                break;
            }
        }
        
        double disA = A[t] -  center;
        double disB = center - A[t-1];
        
        int nn;
        if(disA < disB){
            nn = A[t];
        }else{
            nn = A[t-1];
        }
        
        System.out.println(mm + " " + nn);
        
    }    
}
