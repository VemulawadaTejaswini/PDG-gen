import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String t = null;
    if(a>c && b>c){
      String s1 = Integer.toString(a);
      String s2 = Integer.toString(b);
      t = s1+s2;
      int d = Integer.parseInt(t);
      d+=c;
      System.out.println(d);
    }
    else if(a>b && c>b){
      String s1 = Integer.toString(a);
      String s2 = Integer.toString(c);
      t = s1+s2;
      int d = Integer.parseInt(t);
      d+=b;
      System.out.println(d);
    }
    else if(b>a && c>a){
      String s1 = Integer.toString(b);
      String s2 = Integer.toString(c);
      t = s1+s2;
      int d = Integer.parseInt(t);
      d+=a;
      System.out.println(d);
    }
  }
}