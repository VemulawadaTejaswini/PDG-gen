
import java.io.*;
import java.util.*;

public class Main {

    public static int Lucas(int N) {
        if (N == 0) {
            return 2;
        } else if (N == 1) {
            return 1;
        } else {
            return Lucas(N - 1) + Lucas(N - 2);
        }

    }

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt()+1;
        long A[] = new long[N];
        A[0] = 2;
        A[1] = 1;
        for (int I = 2; I < A.length; I++) {
            A[I]=A[I-1]+A[I-2];
        }
        System.out.println(A[N-1]);
    }
}
