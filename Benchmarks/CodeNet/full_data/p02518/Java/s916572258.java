import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;
      int m = n * (n+1) / 2;
      long[] t = new long[m];

      for(int i=0;i<m;i++){
        t[i] = sc.nextLong();
      }

      Arrays.sort(t);
      ArrayList<BigInteger> even = new ArrayList<BigInteger>();
      ArrayList<BigInteger> odd = new ArrayList<BigInteger>();

      for(int i=0;i<m;i++){
        if(t[i] % 2 == 0){
          even.add(new BigInteger(Long.toString(t[i])));
        }
        else{
          odd.add(new BigInteger(Long.toString(t[i])));
        }
      }

      BigInteger cal = even.get(0).multiply(even.get(1)).divide(odd.get(0));
      long a0 = (long)Math.sqrt(Long.parseLong(cal.toString()));

      System.out.println(a0);
      for(int i=0;i<even.size();i++){
        if(i != 0) System.out.print(" ");
        System.out.print(Long.parseLong(even.get(i).toString()) / a0);
      }
      System.out.println();
    }
  }
}