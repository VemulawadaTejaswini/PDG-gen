import java.util.*;
import java.lang.Double;

public class Main {

    public static void main(String[] args) {
      Scanner reader=new Scanner(System.in);
      int  x=reader.nextInt();
      for(int i=-100;i<100;i++)
      {
        for(int m=-100;m<100;m++)
        {
            long w =(long)Math.pow(i,5);
            long r =(long)Math.pow(m,5);
            //powを使おう部k城は
          if((w+r)==x)
          {

            System.out.println(i+" "+m);
            return;
          }
        }
      }
    }}