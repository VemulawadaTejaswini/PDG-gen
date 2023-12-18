import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        Set<Integer> digitS = new HashSet<>();
        int i = 1;
        while(true) {
           long mul = k * i;
           long ds = digitSum(num);
           if(ds == k) break;
           digitS.add(ds);
           i++;
        }
        int min = Integer.MAX_VALUE;
        for(int d : digitS)
          min = Math.min(min, d);

        System.out.println(min);
    }

    private static int digitSum(long num) {
      int sum = 0;
      while(num > 0) {
        sum += num % 10;
        sum /= 10;
      }
      return sum;
    }
}
