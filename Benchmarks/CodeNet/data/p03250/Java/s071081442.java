import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String s1 = Integer.toString(b);
    String s2 = Integer.toString(c);
    String t = s1+s2;
    int d = Integer.parseInt(t);
    d = d+a;
    System.out.println(d);
  }
}