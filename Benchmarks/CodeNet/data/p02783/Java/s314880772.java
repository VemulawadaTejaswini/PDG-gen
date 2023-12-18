import java.util.*;
class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int a=sc.nextInt();
    
    int ans=h/a+(h%a==0)?0:1;
    
    System.out.println(ans);
  }

}