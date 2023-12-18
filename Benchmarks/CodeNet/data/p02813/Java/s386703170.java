import java.util.*;
import java.io.*;
import java.math.*;

class Main {

    static int[] perm = {1, 2, 6, 24, 120, 720, 5040, 40320};
    //40320, 5040, 720, 120, 24, 6, 2, 1};

    static int calc(int[] P, int N)  {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 1; i <= N; i++) {
            set.add(i);
        }

        int ret = 1;
        for (int i = 0; i < N - 1; i++) {
            int digitNumber = P[i];
            int rank = set.headSet(digitNumber).size();
            set.remove(digitNumber);

            ret += perm[set.size() - 1] * rank;
            //System.out.println(String.format("digit,rank,size,perm,ret=%d %d %d %d %d",digitNumber,rank, set.size(), perm[set.size() - 1], ret));
        }

        return ret;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int[] Q = new int[N];

        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            Q[i] = sc.nextInt();
        }


        int a = calc(P, N);
        int b = calc(Q, N);

        //System.out.println(a);
        //System.out.println(b);
        System.out.println(Math.abs(a - b));
    }

}
