
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int L = 0;
        int R = Integer.MAX_VALUE;

        for(int i=0; i<M; i++){
            int tmpL = sc.nextInt();
            int tmpR = sc.nextInt();

            L = Integer.max(L, tmpL);
            R = Integer.min(R, tmpR);
        }

        int result = R - L +1;
        result = Integer.max(result, 0);

        System.out.println(result);;

        sc.close();

    }
}