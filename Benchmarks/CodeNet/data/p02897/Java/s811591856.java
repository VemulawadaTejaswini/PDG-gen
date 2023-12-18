//Odds of Oddness
import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    double s=n/2;
    double m=n-Math.floor(s);
    double ans=m/n;

    System.out.println(ans);

  }
}
