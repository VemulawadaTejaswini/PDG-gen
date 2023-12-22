import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String t=sc.nextLine();
    int n=s.length();
    int m=t.length();
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n-m+1;i++)
    {
      int cnt=0;
      for(int j=0;j<m;j++)
      {
        if(s.charAt(i+j)!=t.charAt(j))
        cnt++;
      }
      min=Math.min(min,cnt);
    }
    System.out.println(min);
  }
}