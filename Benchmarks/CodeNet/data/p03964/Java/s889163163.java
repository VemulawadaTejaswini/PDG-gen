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

        for (int i = 0; i < N; i++) {
            int d =1;

            if(i >=1){
                int before =  Si[i-1]/(Ti[i-1] +  Ai[i-1]) ;
                while((Ti[i]*d) < Ti[i-1]*before || (Ai[i]*d) < Ai[i-1]*before ){
                    d++;
                }
            }

            Si[i] = (Ti[i]*d) + (Ai[i]*d);
        }
        long temp = Si[0];
        for (int i = 1; i < N; i++) {
            temp += Si[i]- (temp %Si[i]) ;
        }

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
