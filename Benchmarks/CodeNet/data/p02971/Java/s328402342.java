import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N], S = new int[N];
        for(int n=0; n<N; n++){
            A[n] = sc.nextInt();
            S[n] = A[n];
        }
        Arrays.sort(S);
        
        for(int n=0; n<N; n++){
            if(A[n] == S[N-1]) System.out.println(S[N-2]);
            else System.out.println(S[N-1]);
        }
    }
}
