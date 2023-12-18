import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N+1];
        int[] B = new int[N];

        for(int i=0; i<N+1; i++){
            A[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            B[i] = sc.nextInt();
        }

        long destroyed = 0;

        for(int i=0; i<N; i++){
            int j = N-1 - i;

            if(i > j){
                break;
            }

            if(i == j){
                destroyed += destroy1(A, B, i);
                break;
            }

            destroyed += destroy1(A, B, i);
            destroyed += destroy2(A, B, j);
        }

        System.out.println(destroyed);

    }

    public static int destroy1(int[] A, int[] B, int i){
        int destroyed = 0;

        int killable = B[i];
        if(A[i] < killable){
            destroyed += A[i];
            killable -= A[i];
            A[i] = 0;
            if(A[i+1] < killable){
                destroyed += A[i+1];
                A[i+1] = 0;
            }else{
                destroyed += killable;
                A[i+1] -= killable;
            }
        }else {
            destroyed += killable;
            A[i] -= killable;
        }

        return destroyed;
    }

    public static int destroy2(int[] A, int[] B, int i){
        int destroyed = 0;

        int killable = B[i];
        if(A[i+1] < killable){
            destroyed += A[i+1];
            killable -= A[i+1];
            A[i+1] = 0;
            if(A[i] < killable){
                destroyed += A[i];
                A[i] = 0;
            }else{
                destroyed += killable;
                A[i] -= killable;
            }
        }else {
            destroyed += killable;
            A[i+1] -= killable;
        }

        return destroyed;
    }
}