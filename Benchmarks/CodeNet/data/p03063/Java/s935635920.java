import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
      Scanner s = new Scanner(System.in);
      long n = s.nextLong();
      char[] c = s.next().toCharArray();
        long ans =0;
        long a1=0;
      for(int i=0;i<n;i++)
      {
        if(c[i]=='#')
        {
            // c[i+1]='#';
            ans++;
        }
        else if(c[i]=='.')
        {
            a1++;
        }

      }


      System.out.println(Math.min(ans,a1));
    }

    

}