
import java.util.*;







// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Main{
    public static void main(String args[] ) throws Exception {
        
        //Scanner
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] A = new long[n+1];
        long[] B = new long[n];
        for(int i=0;i<n+1;i++) {
            A[i] = scanner.nextLong();
            
        }
        for(int i=0;i<n;i++) {
            B[i] = scanner.nextLong();
        }
        long sum=0;
        for(int i=0;i<n;i++) {
            if(A[i]>B[i]) {
                A[i]-=B[i];
                sum+=B[i];
                B[i] = 0;
            }
            else {
                sum+=A[i];
                B[i]-=A[i];
                A[i]=0;
            }
            
            
            if(A[i+1]>B[i]) {
                A[i+1]-=B[i];
                sum+=B[i];
                B[i] = 0;
            }
            else {
                sum+=A[i+1];
                B[i]-=A[i+1];
                A[i+1]=0;
            }
        }
        System.out.println(sum);
    }
    
    
    
}
