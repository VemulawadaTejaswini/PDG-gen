import java.util.*;

class Main{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      long    N    = scan.nextLong();
      long    M    = scan.nextLong();
      long    Time = 0;

      Time = (long)Math.pow(2, M) * (N - M) * 100 + 1900 * M * (long)Math.pow(2, M);
      System.out.println(Time);
   }
}
