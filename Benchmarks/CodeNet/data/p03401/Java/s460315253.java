import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 2];
        A[0] = 0;
        A[N+ 1] = 0;
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        int length = 0;
        for (int i = 1; i <=  N  ; i++) {
            length += Math.abs(A[i] - A[i + 1]);
        }

        length  = length + Math.abs(A[1]);


        for (int i = 0 ; i < N  ; i ++) {
            int ans = length;
            ans = ans + Math.abs(A[i] - A[i + 2]) - Math.abs(A[i] - A[i + 1]) - Math.abs(A[i + 1] - A[i + 2]) ;
            System.out.println(ans);
        }
    }

}
