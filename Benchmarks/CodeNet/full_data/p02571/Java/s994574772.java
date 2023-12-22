import java.util.*; 
import java.io.*; 
import java.lang.Math; 
public class Main
{
     public static void main(String []args)
     {
        Scanner in=new Scanner(System.in);
        String t,s;
        int max=0,cnt=0;
        s=in.nextLine();
        t=in.nextLine();
        char cs[]=s.toCharArray();
        char ct[]=t.toCharArray();
        for(int i=0;i<s.length()-t.length();i++)
        {
          cnt=0;
          	for(int j=i;j<i+t.length();j++)
            {
              	if(cs[j]==ct[j-i])
                {
                  cnt++;
                }
            }
          if(cnt>max)
          {
            max=cnt;
            if(max==t.length())
            {
              	break;
            }
          }
        }
       System.out.println(t.length()-max);
     }
}

