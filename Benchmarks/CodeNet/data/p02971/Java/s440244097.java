import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }

        int tmp=0;

        for(int i = 0; i < N; i++){
            int max = 0;
            if(i!=0){
                A[i-1] = tmp;
            }
            tmp = A[i];
            A[i] = 0;

            for (int j = 0; j < N; j++) {
                int v = A[j];
                if (v > max) {
                    max = v;
                }
            }
            System.out.println(max);
        }
    }
}