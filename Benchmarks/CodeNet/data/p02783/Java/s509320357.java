import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int a=sc.nextInt();
    int ans=h/a;
    if(h%a!=0){++ans;}
   	System.out.println(ans);
  }
}
