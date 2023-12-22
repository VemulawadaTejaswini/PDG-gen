import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        final double A = s.nextDouble();
        final double B = s.nextDouble();
        final int N = s.nextInt();

        int i = N;
        int maxNum = -1;
        while (i > 0) {
            int result =  (int)(Math.floor(A * i / B) - A * Math.floor(i / B));
            if (maxNum < result) {
                maxNum = result;
            }
            i--;
        }
        System.out.println(maxNum);
  }
}