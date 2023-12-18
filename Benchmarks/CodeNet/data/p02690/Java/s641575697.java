import java.util.*;
import java.lang.Double;

public class Main {

    public static void main(String[] args) {
      Scanner reader=new Scanner(System.in);
      int  x=reader.nextInt();
      int yaku=0;
      for(int i=-100000;i<=x;i++)
      {
        if(x%i==0)
        {
          yaku=i;
          break;
        }
      }System.out.println(yaku);
      int mou=x/yaku;
      System.out.println(mou);
      for(int i=-1;i<x;i++)
      {
        int b=i;
        int a=b+yaku;





        if((a*a*a*a+a^3*b+a^2*b^2+a*b^3+b^4)==mou)
        {
          System.out.println(b+" "+a);
          break;

        }
      }


      }
}
