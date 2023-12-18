import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

                if (Ai[i] == Ai[i]-1) {

                    System.out.println(0);
                    System.exit(0);
                }

                distanceArray[i] = (Ai[i]-1) - (Ai[i-1] + 1);
            }

            if (distanceArray[i] < 0 ) {

                System.out.println(0);
                System.exit(0);
            }
        }

        sc.close();

        distanceArray[M] = N - (Ai[M-1]+1);

        if (distanceArray[M] < 0 ) {

            System.out.println(0);
            System.exit(0);
        }

        BigInteger ans = BigInteger.ONE;

        for (int i =0; i < M+1; i++) {

            ans = ans.multiply(fanc(distanceArray[i]));
        }

        System.out.println(ans.remainder(BigInteger.valueOf(1000000007)));
    }

    public static BigInteger fanc(int num) {

        if (num == 1) {

            return BigInteger.ONE;
        }
        if (num == 2) {

            return BigInteger.ONE.add(BigInteger.ONE);
        }
        return fanc(num - 1).add(fanc(num - 2));
    }

}