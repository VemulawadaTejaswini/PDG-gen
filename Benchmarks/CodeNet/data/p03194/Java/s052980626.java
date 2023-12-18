import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      long p = sc.nextLong();

      int cnt = 0;
      int num = 2;
      long sum = 1;
      while (p > 1) {
         if (p % num == 0) {
            cnt++;
            if (cnt == n)
               sum *= num;
            p /= num;
         } else {
           cnt = 0;
            num++;
         }
      }

      System.out.println(sum);
   }
}