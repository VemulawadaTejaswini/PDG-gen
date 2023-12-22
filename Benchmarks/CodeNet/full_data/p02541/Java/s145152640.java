import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = Long.parseLong(in.nextLine());
        long p = 1;
        long k;
        while (true) {
            double D = Math.sqrt(1 + 8*p*N);
            String sqrt = String.valueOf(D);
            if (sqrt.charAt(sqrt.length()-1) == '0') {
                if ((D-1) % 2 == 0) {
                    k = (long) (D - 1) / 2;
                    break;
                }
            }
            p++;
        }
        System.out.println(k);
    }
}
