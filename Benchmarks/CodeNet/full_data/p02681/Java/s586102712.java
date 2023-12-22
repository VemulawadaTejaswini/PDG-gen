import java.util.*;

public static void main(String [] args)
{
  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  String t = sc.next();
  
  if(s==t-1 && s.length == t.length-1)
  {
    System.out.println("Yes");
  }
  else
  {
    System.out.println("No");
  }
}