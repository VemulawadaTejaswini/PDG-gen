import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int M;
    static int A;
    static long B;
    static long C;
    static int[][] map;
    static int min = 9999999;
    static int[] moto = new int[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();

        int sum = -N;

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            sum += a;
        }

        System.out.println(sum);



    }




}

