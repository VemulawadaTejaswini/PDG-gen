import java.util.*;
import java.math.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    BigInteger l = new BigInteger(sc.next());
    BigInteger r = new BigInteger(sc.next());
    BigInteger d = r.mod(BigInteger.valueOf(2019));
    int a = (r.subtract(d)).compareTo(l);
    if(a == 1 || a == 0)
      System.out.println(0);
    else
    {
    int ll = l.intValue();
      int rr = r.intValue();
    long ar[] = new long[(int)(rr-ll+1)];
    int k = 0;
    for(int i = ll;i <= rr;i++)
    {	
      ar[k] = i%2019;
      k++;
    }
    Arrays.sort(ar);
    System.out.println((ar[0] * ar[1])%2019);
    }
  }
}
  