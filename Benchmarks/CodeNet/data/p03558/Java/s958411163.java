import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        Set<Long> digitS = new HashSet<>();
        int i = 1;
        while(true) {
           long mul = k * i;
           long ds = digitSum(mul);
           if(digitS.contains(ds)) break;
           digitS.add(ds);
           i++;
        }
        long min = Long.MAX_VALUE;
        for(long d : digitS)
          min = Math.min(min, d);

        System.out.println(min);
    }

    private static long digitSum(long num) {
      long sum = 0;
      while(num > 0) {
        sum += (num % 10);
        num /= 10;
      }
      return sum;
    }
}
