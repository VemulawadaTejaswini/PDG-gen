import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long x = in.nextLong();
        System.out.println(countDivisibles(a,b,x));
    }
      public static long countDivisibles(long A, long B, long M)
     {

         if (A % M == 0)
             return (B / M) - (A / M) + 1;

         return (B / M) - (A / M);
     }

 }