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

        long wareruC = B / C - A / C + 1L;
        long wareruD = B / D - A / D + 1L;
        long wareruCD = B / (C * D) - A / (C * D) + 1L;

        long result = (B - A + 1L) - wareruC - wareruD + wareruCD + 1L;

        System.out.println(result);

    }

}
