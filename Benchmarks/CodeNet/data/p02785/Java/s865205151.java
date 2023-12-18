import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();
        int K = sc.nextInt();

        int[] H = new int[N];

        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        Arrays.sort(H);
        long h = 0;

        for (int i = 0; i < Math.max(0,N-K); i++) {
            h += H[i];
        }


        System.out.println(Math.max(0,h));

    }



}
