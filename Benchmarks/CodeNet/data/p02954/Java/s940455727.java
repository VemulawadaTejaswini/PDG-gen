import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int cnt[] = new int[s.length()];
    for(int i = 0;i<s.length();i++)
    {
      String before = s.substring(i,i+1);
      int mvcount = 0;
      int pos = i;
      while(true)
      {
        String now = s.substring(pos,pos+1);
        if(!now.equals(before))
        {
          if(mvcount%2==0)
          {
            cnt[pos]++;
            break;
          }
          else
          {
            if(now.equals("R"))
            {
              cnt[pos+1]++;
              break;
            }
            else if(now.equals("L"))
            {
              cnt[pos-1]++;
             break; 
            }
          }
        }
        before = now;
        if(now.equals("R")){pos++;}
        else if(now.equals("L")){pos--;}
        mvcount++;
      }
    }
    for(int o = 0;o<s.length();o++)
  	{
    	System.out.print(cnt[o]+" ");
  	}
  	System.out.println("");
  }
}