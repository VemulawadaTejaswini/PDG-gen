import java.util.*;
import java.lang.Double;

public class Main {

    public static void main(String[] args) {
      Scanner reader=new Scanner(System.in);
      int  n=reader.nextInt();
      int  m=reader.nextInt();
      int h[]=new int [n];
      int road[][]=new int [n][n];
      int count=0;
      for(int i=0;i<n;i++)
      {
        for(int k=0;k<n;k++)
        {
          road[i][k]=0;
        }
      }
      for(int i=0;i<n;i++)
      {
        h[i]=reader.nextInt();
      }

      for(int i=0;i<m;i++)
      {
        int a=reader.nextInt();
        int b=reader.nextInt();
        road[a-1][b-1]=1;
        road[b-1][a-1]=1;
      }
      for(int i=0;i<n;i++)
      {int ans=1;
        for(int l=0;l<n;l++){
        if(road[i][l]==1)
        {

          if(h[l]>=h[i]){

            ans=0;
            break;
          }
        }

      }
      if(ans==1)
      {
  
      count++;

    }

      }
      System.out.println(count);
      }
}
