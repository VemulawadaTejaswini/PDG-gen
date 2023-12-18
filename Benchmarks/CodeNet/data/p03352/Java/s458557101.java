import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        TH:
        for (int i = x; i > 0; i--) {
            for (int j = 2; j < x  ; j++) {
                double  nthRoot =  Math.pow(i, 1.0/ j);
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
