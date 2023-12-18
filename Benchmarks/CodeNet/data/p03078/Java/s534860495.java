// https://atcoder.jp/contests/abc123/tasks/abc123_d

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int K = sc.nextInt();

        Long[] A = new Long[X];
        Long[] B = new Long[Y];
        Long[] C = new Long[Z];
        Long[] AB = new Long[X*Y];
        int size = Math.min(AB.length, K);
        Long[] ABC = new Long[size * Z];
        for (int i = 0; i < X; i++) {
            A[i] = Long.parseLong(sc.next());
        }

        for (int i = 0; i < Y; i++) {
            B[i] = Long.parseLong(sc.next());
        }

        for (int i = 0; i < Z; i++) {
            C[i] = Long.parseLong(sc.next());
        }

        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                AB[Y*i+j] = A[i] + B[j];
            }
        }

        Arrays.sort(AB, Collections.reverseOrder());
        Arrays.sort(C, Collections.reverseOrder());

        int csize = Math.min(Z,K);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < csize; j++) {
                ABC[Z*i+j] = AB[i] + C[j];
            }
        }

        Arrays.sort(ABC, Collections.reverseOrder());

        for (int i = 0; i < K; i++) {
            System.out.println(ABC[i]);
        }

    }
}