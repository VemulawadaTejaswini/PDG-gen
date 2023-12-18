import java.util.*;

public class Main{
  static int min_value(int a,int b,int c){
    if(a>b) return min_value(b,a,c);
    else if(a>c) return min_value(c,b,a);
    else return a+b;

  }

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(min_value(a,b,c));
  }
}