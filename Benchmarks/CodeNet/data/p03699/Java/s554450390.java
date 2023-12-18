
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        Integer A[] = new Integer[N];
        int Sum = 0;
        for (int I = 0; I < N; I++) {
            A[I] = Input.nextInt();
            Sum += A[I];
        }
        try {
            Arrays.sort(A);
            if (Sum % 10 == 0) {
                int X = 0;
                while ((Sum) % 10 == 0) {
                    Sum -= A[X];
                    X++;
                }
            }
        } catch (Exception e) {
        }
        System.out.println(Sum);
    }
}

//WWW.IJustAnsweredWrong.COM

//Kappa
