import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    int d = n/x;
    if(n%x!=0){
      d=d+1;
    }
    System.out.println(d*t);
  }
}