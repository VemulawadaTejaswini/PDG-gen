import java.util.Scanner;
public class Main
{
    public static String removeCharAt(String s,int pos)
    {
        System.out.println("executed");
        return s.substring(0,pos)+s.substring(pos+1);
    }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n;
    n = sc.nextInt();
    String s = sc.next(); 
    char temparr[]=s.toCharArray();
    int count=0;
    //System.out.println(temparr.length);
    for(int i=0;i<temparr.length-1;i++)
    {
        if(temparr[i]!='1')
        {
            for(int j=i+1;j<temparr.length;j++)
            {
                if(temparr[i]==temparr[j])
                {
                    temparr[j]='1';
                    //s=removeCharAt(s,j);
                
                    count++;
                }
                else 
                    break;
                //System.out.println(s);
            }
        }
    }
    System.out.println(s.length()-count);
      
  }
}