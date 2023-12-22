import java.util.*;
import java.lang.Double;

public class Main {

    public static void main(String[] args) {
      Scanner reader=new Scanner(System.in);
      int  n=reader.nextInt();
      int  m=reader.nextInt();
      int h[]=new int [n];
      int i;
      for(i=0;i<n;i++)
      {
        h[i]=reader.nextInt();
      }
      boolean x[]=new boolean[n];
      Arrays.fill(x,true);

      for(i=0;i<m;i++)
      {
        int a=reader.nextInt()-1;
        int b=reader.nextInt()-1;
        if(h[a]>h[b])
        x[b]=false;
        if(h[a]<h[b])
        x[a]=false;
        if(h[a]==h[b])
        {
          x[a]=false;
          x[b]=false;
        }
      }
        int count=0;
        for(i=0;i<n;i++)
        {
          if(x[i]==true)count++;
        }

          System.out.println(count);


      }

    }