import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
            B[i] = A[i];
        }
        Arrays.sort(A);

        for(int i=0;i<N;i++){
            if(B[i] == A[N-1]){
                System.out.println(A[N-2]);
            } else {
                System.out.println(A[N-1]);
            }

        }


    }

}
