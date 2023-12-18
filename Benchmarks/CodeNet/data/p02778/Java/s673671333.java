import java.util.*;
class java
  {
  public static void main()
    {
    Scanner sc=new Scanner(System.in);
    String s = sc.nextLine();
   
     for(int i=0;i<s.length();i++)
       {
       char c = s.charAt(i);
       System.out.println(s.replace(c,'x'));
                          }
                          }}
