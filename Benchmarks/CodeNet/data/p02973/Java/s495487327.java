import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int colorCount = N-1;
        int min = 1000000000;
        for(int i=0;i<N;i++){
            B[i] = -1;
            A[i] = sc.nextInt();
        }

        for(int i=0;i<N;i++){
            if (A[i] <= min){
                min = A[i];
                B[colorCount] = A[i];
                colorCount--;
            } else {
                for(int j=colorCount;B[j] > -1;j--){
                    if(A[j] > B[j]){
                        A[j] = B[j];
                    }
                    Arrays.sort(B,j,N-1);
                }
            }
        }
        System.out.println(N -1- colorCount);

    }

}
