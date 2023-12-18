
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        sc.close();

        /** だめだったその１**/
        //        long result = LongStream.rangeClosed(A, B)
        //                .filter(i-> i%C!=0)
        //                .filter(i-> i%D!=0)
        //                .count();
        //        
        //        System.out.println(result);

        /** だめだったその２**/
        //        long resultNoHantai = LongStream.rangeClosed(A, B)
        //                .filter(i -> i % C == 0 || i % D == 0)
        //                .count();
        //
        //        long result = B - A + 1L - resultNoHantai;
        //        System.out.println(result);

        long wareruC = B / C - A / C;
        if (A % C == 0L)
            wareruC++;

        long wareruD = B / D - A / D;
        if (A % D == 0L)
            wareruD++;

        long saisyoukoubaisuu = lcm(C, D);

        long wareruCD = B / saisyoukoubaisuu - A / saisyoukoubaisuu;
        if (A % saisyoukoubaisuu == 0L)
            wareruCD++;

        long result = (B - A + 1L) - wareruC - wareruD + wareruCD;

        System.out.println(result);

    }

    static long lcm (long a, long b) {
        long temp;
        long c = a;
        c *= b;
        while((temp = a%b)!=0) {
            a = b;
            b = temp;
        }
        return (long)(c/b);
    }
}
