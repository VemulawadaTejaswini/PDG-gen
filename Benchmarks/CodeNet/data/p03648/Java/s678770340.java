import java.util.*;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {
    private static final int N = 50;
    private static long K;
    private static int a[] = new int[N];

    public static void input(){
        Scanner scan = new Scanner(System.in);
        K = scan.nextInt();
    }

    public static void main(String args[]){
        //入力
        input();

        for (int i=0;i<N;i++){
            a[i] = i;
        }

        long quotient = K / N;
        long remainder = K % N;

        for (int i=0;i<N;i++){
            a[i] += quotient;
        }

        for (int i=0;i<remainder;i++){
            a[i] = a[i] + N - ((int)remainder - 1);   //ひかれる数が一回少ない
        }
        for (int i=(int)remainder;i<N;i++){
            a[i] -= remainder;
        }

        System.out.println(N);
        for (int i=0;i<N;i++){
            System.out.print(a[i] + " ");
        }

    }
}