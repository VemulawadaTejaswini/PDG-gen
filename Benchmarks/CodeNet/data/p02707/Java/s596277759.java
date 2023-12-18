import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N - 1];
        int[] B = new int[N];



        for(int i=0; i<N-1; i++){
            A[i] = sc.nextInt();
            B[i] = 0;
        }
        B[N - 1] = 0;

        for(int i=0; i<N-1; i++){
            B[A[i] - 1] += 1;
        }

        for(int i=0; i<N; i++){
            System.out.println(B[i]);
        }
    }
}