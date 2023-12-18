import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int x = 100*(n-m)+1900*m;
    int y = (int)Math.pow(2,m);
    System.out.println(x*y);
  }
}
