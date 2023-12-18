import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt(), a=sc.nextInt(), b=sc.nextInt();
    x-=a;
    while(b<=x){
      x-=b;
    }
    System.out.println(x);
  }
}