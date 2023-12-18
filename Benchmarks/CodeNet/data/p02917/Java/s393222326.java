import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] Bstr = br.readLine().split(" ");
        int[] B = new int[N-1];

        for(int i = 0; i < N-1; i++){
            B[i] = Integer.parseInt(Bstr[i]);
        }
        
        int[] A = new int[N];
        
        int sum = 0;
        for(int i = 0; i < N-1; i++){
            if ( i == 0 ){
                A[i] = B[i];
            } else {
                A[i] = Math.min(A[i], B[i]);
            }
            
            sum += A[i];
            
            A[i+1] = B[i];
            
            if(i == N-2 ) sum+=A[N-1];
        }
        
        System.out.println(sum);
    }
}
