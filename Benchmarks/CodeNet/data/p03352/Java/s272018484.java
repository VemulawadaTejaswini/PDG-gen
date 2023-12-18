import java.math.BigInteger;
import java.util.Scanner;

public class Atcoder97B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        TH:
        for (int i = x; i > 0; i--) {
            for (int j = 2; j <= i  ; j++) {
                double  nthRoot =  Math.round(Math.pow(i, 10.0/ j * 10));
                int intNthRoot = (int) nthRoot;
                if (intNthRoot == nthRoot){
                    System.out.println(i);
                    break TH;
                }
            }
            if (i == 1 ){
                System.out.println(1);
                break;
            }
        }
    }
}
