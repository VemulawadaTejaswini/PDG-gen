import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] s = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextLong();
        }
        sc.close();

        Arrays.sort(A);
        s[0] = A[0];
        for(int i = 1; i < N; i++){
            s[i] = s[i-1] + A[i];
        }
        int count = N;
        int start = 0;
        for(int i = 0; i < N-1; i++){
            if(s[i]*2 < A[i+1]){
                count -= (i-start+1);
                start = i+1;
            }
        }
        System.out.println(count);
   }
}