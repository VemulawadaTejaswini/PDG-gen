import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];
        int B[] = new int[M];
        int count = 0;
        int i = 0;
        int j = 0;

        for ( i = 0; i < N; i++ ){
            A[i] = sc.nextInt();
        }

        for ( j = 0; j < M; j++ ){
            B[j] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        i = 0;
        j = 0;
        count = 0;

        while(true){
            if((K > A[i]) || (K > B[j])){
                if ( A[i] < B[j] ){
                    K-=A[i];
                    i++;
                }else{
                    K-=B[j];
                    j++;
                }
                count++;
            }else{
                break;
            }
        }

        System.out.println(count);
    }
}
