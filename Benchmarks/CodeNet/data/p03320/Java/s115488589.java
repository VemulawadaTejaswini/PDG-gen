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

        for (int i = 0; i < N; i++) {
            int kyu = i / 9;
            System.out.print((i % 9) + 1);
            for (int j = 0; j < kyu; j++) {
                System.out.print(9);
            }
            System.out.println();
        }

    }

    static public int sum(int s){
        int ret = 0;
        while(s > 0 ){
            ret += s % 10;
            s = s / 10;
        }
        return ret;
    }

}

