import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static int A;
    static long B;
    static long C;
    static long[] x = new long[1000];
    static long[] y = new long[1000];
    static long[] z = new long[1000];





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int N = scanner.nextInt();
//        int M = scanner.nextInt();
//
//        for (int i = 0; i < N; i++) {
//            x[i] = scanner.nextInt();
//            y[i] = scanner.nextInt();
//            z[i] = scanner.nextInt();
//        }

        int A = scanner.nextInt();
        long B = scanner.nextInt();

        if(A == 0){
            System.out.println(B * 1);
        }else if(A == 1){
            System.out.println(B * 100);
        }else{
            System.out.println(B * 10000);
        }


    }

//    public static void itter()

}

