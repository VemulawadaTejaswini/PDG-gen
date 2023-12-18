import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int [] Ai = new int[M];
        int [] distanceArray = new int[M+1];

        for (int i = 0; i < M; i++) {

            Ai[i] = Integer.parseInt(sc.next());

            if (i == 0) {

                distanceArray[0] = Ai[0]-1;
            }  else {

                distanceArray[i] = Ai[i] - Ai[i-1] -2;
            }

            if (distanceArray[i] < 0 ) {

                System.out.println(0);
                System.exit(0);
            }
        }

        sc.close();

        distanceArray[M] = N - distanceArray[M-1] -2;

        if (distanceArray[M-1] < 0 ) {

            System.out.println(0);
            System.exit(0);
        }

        long ans = 1;

        for (int i =0; i <= M; i++) {

            if (distanceArray[i] != 0) {

                ans = ans*fanc(0,distanceArray[i]-1,1);
            }
        }

        System.out.println(ans%1000000007);
    }

    //f1 = 1, fi(奇数) = f(i-1)+1, fi(偶数) = f(i-1)+2
    public static long fanc(int count,int aim, long rtval) {

        if (count == aim) { return rtval; }

        count++;

         if (count == 1) {

            rtval = 2;
            return fanc(count, aim, rtval);

        } else if (count%2 == 0) {

            rtval = rtval + 1;
            return fanc(count, aim, rtval);
        } else {

            rtval = rtval + 2;
            return fanc(count, aim, rtval);
        }
    }

}
