import java.io.*;
import java.math.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      long a = Math.abs(sc.nextLong());
      long moves = sc.nextLong();
      long diff = sc.nextLong();
      BigInteger b_a = new BigInteger(a+"");
      BigInteger multi = new BigInteger(moves*diff+"");
      long ans = 0L;
      if(b_a.compareTo(multi)>=0)
      {
          ans = a-moves*diff;
      }
      else
      {
          long div = a/diff;
          moves = moves-div;
          ans = a%diff;
          if(moves%2==1)
          {
              ans = Math.abs((a%diff)-diff);
          }
      }
      w.println(ans);
      w.close();
    }
}