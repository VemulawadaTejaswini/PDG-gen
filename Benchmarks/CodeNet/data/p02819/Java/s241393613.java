import java.math.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    BigInteger b=in.nextBigInteger();
    if(b.isProbablePrime(70)==true)
    {
      System.out.println(b);
    }
    else
    {
      System.out.println(b.nextProbablePrime());
    }
  }
}