import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ax = 0;
    int bx = 0;
    ax=Math.max(a-x,x-a);
    bx=Math.max(b-x,x-b);
    if(ax<bx){
      System.out.println("A");
    }else{
      System.out.println("B");
    }
  }
  

  
}