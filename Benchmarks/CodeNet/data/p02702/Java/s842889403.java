import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int N = s.length();
      int array [] = new int[2019];
      array[0]+=1;
      int count = 0;
      int i = 0;
      for(i = N-1; i > -1; i--){
        String x = s.substring(i, N);
        BigInteger num = new BigInteger(x);
        int k = num.remainder(BigInteger.valueOf(2019)).intValue();
        array[k]++;
      }
      for(i = 0; i < 2019; i++){
        count += array[i]*(array[i]-1)/2;
      }
      System.out.println(count);
    }
}
