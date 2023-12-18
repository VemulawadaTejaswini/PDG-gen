import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    int n=sc.nextInt();
    int k=sc.nextInt();
    HashSet<Integer> h=new HashSet<Integer>();
    for(int j=1;j<=k;j++)
      h.add(sc.nextInt());
    while(!comp(n,h))n++;
    System.out.println(n);
  }
  public static boolean comp(int k,HashSet<Integer> h)
  {
    String s=Integer.toString(k);
    for(int i=0;i<s.length();i++)
    {
      int o=s.charAt(i)-'0';
      if(h.contains(o))
        return false;
    }
    return true;}}
