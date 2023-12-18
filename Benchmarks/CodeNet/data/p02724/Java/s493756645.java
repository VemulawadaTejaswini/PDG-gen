import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int k = a/500;
    k*=1000;
    a = a%500;
    int x = a/5;
    x*=5;
    pl((k+x)+"");
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
