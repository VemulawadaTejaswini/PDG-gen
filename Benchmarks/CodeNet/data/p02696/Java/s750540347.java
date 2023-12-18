import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        final double A = s.nextDouble();
        final double B = s.nextDouble();
        final long N = s.nextLong();

        long i = N;
        long maxNum = -1;
        while (i > 0) {
            long result =  (long)(Math.floor(A * i / B) - A * Math.floor(i / B));
            // System.out.println(result);
            if (maxNum < result) {
                maxNum = result;
            }
            i--;
        }
        System.out.println(maxNum);
  }
}