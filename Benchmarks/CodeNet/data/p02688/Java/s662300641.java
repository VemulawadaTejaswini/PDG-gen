import java.util.*;
import java.lang.Double;

public class Main {

    public static void main(String[] args) {
      Scanner reader=new Scanner(System.in);
      int  n=reader.nextInt();
      int  k=reader.nextInt();
      int d[]=new int[k];
      int a[][]=new int[k][k];
      Set<Integer> set=new HashSet<Integer>();
      for(int i=0;i<k;i++)
      {
        d[i]=reader.nextInt();
        for(int j=0;j<d[i];j++)
        {
          set.add(reader.nextInt());

        }

      }
      System.out.println(n-set.size());

      }
}
