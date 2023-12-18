import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        int[] Ti;
        int[] Ai;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            Ti = new int[N];
            Ai = new int[N];
            for (int i = 0; i < N; i++) {
                Ti[i] = sc.nextInt();
                Ai[i] = sc.nextInt();
            }
        }
        int[] Si = new int[N];

        for (int i = 1; i < N; i++) {
            if(Ti[i] >= Ti[i-1] && Ai[i] >= Ai[i-1]){
                continue;
            }
            long t = (long) Math.ceil(((double)Ti[i-1]/Ti[i]));
            long a = (long) Math.ceil(((double)Ai[i-1]/Ai[i]));
            long d = Math.max(t, a);
            //debug("d"+d);
            Ti[i]=(int) (Ti[i]*d);
            Ai[i] = (int) (Ai[i]*d);
        }
        long temp = Ti[N-1]+Ai[N-1];


        System.out.println(temp);
    }

    //最小公倍数
    static long lcm(long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) (c / b);
    }

}
