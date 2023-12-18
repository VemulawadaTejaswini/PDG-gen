import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int count=0;
    String s1=sc.next();
    count++;
    String m=s1;
    for(int i=1;i<N;i++)
    {
      String s=sc.next();
      count++;
      if(m==s)
      count--;
      m=s;
      
    }
    
    System.out.println(count);
  }
}
