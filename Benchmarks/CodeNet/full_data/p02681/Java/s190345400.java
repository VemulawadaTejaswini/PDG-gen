import java.util.*;
class solution{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextInt();
    String t = sc.nextInt();
    for(int i=0;i<s.length();i++)
    {
     if(s.charAt(i)!=t.charAt(i))
     {
      System.out.println("No");
       break;
     }
       
    }
    System.out.println("Yes");
    
  }
}