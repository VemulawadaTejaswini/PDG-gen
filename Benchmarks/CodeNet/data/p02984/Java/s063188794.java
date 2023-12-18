import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] X = new long[N];
        X[0] = 0;

        for(int i=0;i<N;i++){
            A[i] = sc.nextLong();
            if(i % 2 == 0){
                X[0] += A[i];
            } else {
                X[0] -= A[i];
            }
        }
        System.out.print(X[0] + " ");

        for(int i =1; i<N-1;i++){
            X[i] = 2*A[i-1] - X[i-1];
            System.out.print(X[i] + " ");
    }
        System.out.print(2*A[N-1] - X[0]);

    }



}
