import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double W = Integer.parseInt(sc.next());
    double H = Integer.parseInt(sc.next());
    double x = Integer.parseInt(sc.next());
    double y = Integer.parseInt(sc.next());

    double ans = (W*H)/2.0;
    if(x==W/2.0 && y==H/2.0){
      System.out.println(ans + " " + 1);
    }else{
      System.out.println(ans + " " + 0);
    }
  }
}