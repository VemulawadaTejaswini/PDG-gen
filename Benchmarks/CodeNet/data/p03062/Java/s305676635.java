import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer A[] = new Integer[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        if(A[0]<A[N-1]){
            for(int i=0; i<N-1; i++){
                if(A[i]+A[i+1]<0){
                    A[i]=-A[i];
                    A[i+1]=-A[i+1];
                }
            }
        } else {
            for(int i=N-2; i>-1; i--){
                if(A[i]+A[i+1]<0){
                    A[i]=-A[i];
                    A[i+1]=-A[i+1];
                }
            }
        }
        int kotae =0;
        for(int i=0; i<N; i++){
            kotae = kotae + A[i];
        }
        System.out.println(kotae);
    }
}