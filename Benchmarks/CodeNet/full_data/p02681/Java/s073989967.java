import java.util.*;

class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String s1=sc.next();
    
    if(s1.length()-1!=s.length())
    {System.out.println("No");return 0;}
    
    
    if(s1.contains(s))
      System.out.println("Yes");
    else
      System.out.println("No");
    
  }
}  