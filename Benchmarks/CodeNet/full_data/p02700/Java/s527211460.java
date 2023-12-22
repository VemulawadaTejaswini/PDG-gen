import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int w = Math.max(a,b);
    int x = Math.max(c,d);
    int y = x-Math.min(a,b);
    int z =0;
    if(x==c){
      z=Math.max(y,d);
    }
    else{
      z=Math.max(y,c);
    if(w>z){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}