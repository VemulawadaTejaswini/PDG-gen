import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long x = Long.parseLong(s.next());
        double loggg = Math.log(5.0);

        for (long i = 1;;i++) {
            long expect5 = i*i*i*i*i - x;
            int fogo = 1;
            if (expect5 < 0) {
                fogo = -1;
            }

            double testV = Math.pow(fogo * expect5, loggg);
            long k = (long)testV;
            long po5 = i*i*i*i*i;
            if (po5 - fogo *k*k*k*k*k == x) {
                System.out.println("" + i + " " + fogo *k);
                return;
            } else {
                k+= fogo ;
                if (po5 - fogo *k*k*k*k*k == x) {
                    System.out.println("" + i + " " + fogo *k);
                    return;
                }
            }
        }
    }
}