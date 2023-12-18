import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static int M;
    static int A;
    static long B;
    static long C;
    static int[] map = new int[1000000];
    static int min = 9999999;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();
        min = -1;
        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextInt();
            if(map[i] == 1)min = i;
        }
//        System.out.println(min);

        M--;

        int ans = 0;
        if(min != 0){
            ans += (min + M - 1) / M;
        }
//        System.out.println(ans);

        if(N - min - 1 != 0){
            ans += (N - min + M - 2) / M;
        }


        System.out.println(ans);





    }

}

