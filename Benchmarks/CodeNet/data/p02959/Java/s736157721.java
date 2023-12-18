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

        int killed = 0;

        for(int i=0; i<N; i++){
            int killable = B[i];
            if(A[i] < killable){
                killed += A[i];
                killable -= A[i];
                A[i] = 0;
                if(A[i+1] < killable){
                    killed += A[i+1];
                    A[i+1] = 0;
                }else{
                    killed += killable;
                    A[i+1] -= killable;
                }
            }else {
                killed += killable;
            }
        }

        int killed2 = 0;

        for(int i=N-1; i>0; i--){
            int killable = B[i];
            if(A[i+1] < killable){
                killed2 += A[i+1];
                killable -= A[i+1];
                A[i+1] = 0;
                if(A[i] < killable){
                    killed2 += A[i];
                    A[i] = 0;
                }else{
                    killed2 += killable;
                    A[i] -= killable;
                }
            }else {
                killed2 += killable;
            }
        }

        int result = Math.max(killed, killed2);

        System.out.println(result);

    }
}