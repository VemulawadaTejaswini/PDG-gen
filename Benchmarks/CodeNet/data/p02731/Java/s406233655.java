import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    double side = (double)l / 3;
    double ans = side * side * side;
    System.out.println(ans);
  }
}
