import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        sc.close();

        int A = -118;
        int B = -119;
        boolean isOK = false;
        for (; A <= 119; A++) {
            if (A == 0) {
                System.out.println("");
            }
            B = -119;
            for (; B <= 119; B++) {
                if (B == 0) {
                    System.out.println("");
                }
                long result = (long) (Math.pow((double) A, 5) - Math.pow((double) B, 5));
                if (result == X) {
                    isOK = true;
                    break;
                }
            }
            if (isOK) {
                break;
            }
        }

        System.out.println(String.valueOf(A) + " " + String.valueOf(B));
    }

}
