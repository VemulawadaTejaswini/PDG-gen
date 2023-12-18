import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long A = sc.nextLong();
        long B = sc.nextLong();


        String ans = "";
        for (int digit = 1; digit <= 40; digit++) {
            long v = (long) Math.pow(2, digit);
            long indexA = A % v;
            long indexB = B % v;
            long numOfZero = (long)Math.pow(2, digit - 1);

            long count = 0;
            if (indexA > numOfZero) {
                long diff = numOfZero - (indexA - numOfZero);
                count += diff;
            } else if (B - A > numOfZero) {
                count += numOfZero;
            }
            if (indexB >= numOfZero) {
                count += (indexB + 1 - numOfZero);
            }
            ans = ((count % 2 == 1) ? "1" : "0") + ans;
            if (v > B) {
                break;
            }
        }
        System.out.println(Long.parseLong(ans, 2));
    }
}