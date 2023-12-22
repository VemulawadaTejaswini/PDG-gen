import java.util.Arrays;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Integer[] A = new Integer[N];
        int count = 0;
        int flag = 1;

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for (int i = 0; i < N; i++) {
            if(i == 0){
                if(A[i] == A[i+1]){
                    continue;
                }
            }
            for (int j = 0; j < i; j++) {
                if (A[i] % A[j] == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
            }
            flag = 1;
        }
        System.out.println(count);
    }
}