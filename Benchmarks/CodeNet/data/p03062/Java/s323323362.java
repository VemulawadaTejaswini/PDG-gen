import java.util.*;
import static java.lang.Math.abs;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        boolean jud = true;
        int w = 0;
        long ans = 0;

        for(int i = 0;i < N;i++){
            A[i] = sc.nextInt();
            B[i] = abs(A[i]);
        }
        Arrays.sort(A);
        Arrays.sort(B);
        while(jud == true){
            if(B[0] == A[w]){
                A[w] = A[N-1];
                A[N-1] = B[0];
                jud = false;
            }else if(B[0] == A[w]*(-1)){
                A[w] = A[N-1];
                A[N-1] = B[0] *(-1);
                jud = false;
            }
            w++;
        }
        for(int i = 0;i < N;i++){
            if(A[i] < 0){
                A[i] = A[i] * (-1);
                A[i+1] = A[i+1] * (-1);
            }
            System.out.println(A[i]);
        }

        for(int i = 0;i < N;i++){
            ans += A[i];
        }

        System.out.println(ans);
    }
}