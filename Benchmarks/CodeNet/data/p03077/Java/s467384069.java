import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long e = sc.nextLong();


        long pos[] = new long[6];
        pos[0] = n;

        long count = 0;

        long start = System.currentTimeMillis();

        while(pos[5]!=n){
            long A = Math.min(pos[0], a);
            long B = Math.min(pos[1], b);
            long C = Math.min(pos[2], c);
            long D = Math.min(pos[3], d);
            long E = Math.min(pos[4], e);
            pos[0] -= A;
            pos[1] -= B;
            pos[2] -= C;
            pos[3] -= D;
            pos[4] -= E;
            pos[1] += A;
            pos[2] += B;
            pos[3] += C;
            pos[4] += D;
            pos[5] += E;
//                pos[0] -= Math.min(pos[0], a);
//                pos[1] -= Math.min(pos[1], b);
//                pos[2] -= Math.min(pos[2], c);
//                pos[3] -= Math.min(pos[3], d);
//                pos[4] -= Math.min(pos[4], e);
//                pos[1] += Math.min(pos[0], a);
//                pos[2] += Math.min(pos[1], b);
//                pos[3] += Math.min(pos[2], c);
//                pos[4] += Math.min(pos[3], d);
//                pos[5] += Math.min(pos[4], e);
                count++;
            }

            long end = System.currentTimeMillis();

        System.out.println(count);
//        System.out.println((end-start) +"ms");

    }

}