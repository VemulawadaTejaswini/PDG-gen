import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());
        Integer[] A = new Integer[N+1];
        Integer[] H = new Integer[N];

        for(int i = 0; i < N+1; i++) {
            A[i] = Integer.parseInt(scanner.next());
        }

        for(int i = 0; i < N; i++) {
            H[i] = Integer.parseInt(scanner.next());
        }

        int res = 0;
        int total = 0;

        for(int i = 0; i < N; i++) {
            int tmp = A[i] - H[i];
            res = tmp + A[i+1];
            if(0 > res) {
                total += (A[i] + A[i+1]);
                A[i+1] = 0;
            } else {
                total += H[i];
                if(0 >= tmp ) A[i+1] = Math.abs(res);
            }
            res = 0;
        }

        System.out.println(total);
    }
}