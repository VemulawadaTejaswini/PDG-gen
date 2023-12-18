import java.util.*;

public final class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        long Z = s.nextLong();

        long W = s.nextLong();

        long firstW = W;

        long[] a = new long[N];

        for (int i = 0; i < N;i ++) {

            a[i] = s.nextInt();
        }
        int m = 0;

        int flag = 0;

        while (m < N) {

            int next = m;

            for (int i = m+1; i < N; i++) {

                if (flag % 2 == 0) {
                    //Z maximize
                    if (Math.abs(W- a[next]) <= Math.abs(W-a[i])) next = i;

                } else {
                    //W minimize
                    if (Math.abs(Z- a[next]) >=  Math.abs(Z-a[i])) next = i;
                }
            }

            m = next+1;


            flag++;

            if (flag % 2== 0) Z = a[next];

            else W = a[next];
        }

        int result = (int) Math.abs(Z-W);

        if (Math.abs(firstW - a[N-1]) > result) System.out.print(Math.abs(firstW - a[N-1]));
       else  System.out.print(result);





    }


}