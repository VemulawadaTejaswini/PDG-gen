import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine();) {
          String line = sc.nextLine();
          int num = Integer.parseInt(line);
          int result = calculatePrimeNumberQty(num);
          System.out.println(result);
        }
    }

    private static int calculatePrimeNumberQty(int argNum) {
      if (argNum == 2) return 1;
        
      int cnt = 0;
      for (int num = 2; num < argNum; num++) {
        boolean isPrime = judgePrimeNumber(num);
        if (isPrime) {
          cnt++;
        }
      }
      return cnt;
    }

    private static boolean judgePrimeNumber(int num) {
      if (num == 2) return true;
      if (num % 2 == 0) return false;

      for (int i=2; i < num; i++) {
        if (num % i == 0) return false;
      }
      return true;
    }
}