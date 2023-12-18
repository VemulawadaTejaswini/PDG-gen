import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long count = 0;
        for(int i = 0; i < N; i++) {
            long xor = 0L;
            long add = 0L;
            for(int j = 0; ; j++) {
                int id = i + j;
                if(id >= N) break;
                add += A[id];
                xor ^= A[id];

                if(add == xor) count++;
                if(xor < add) break;
            }
        }
        System.out.println(count);





    }
}