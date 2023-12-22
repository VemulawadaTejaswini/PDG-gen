import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double d = sc.nextDouble();
    String ans;

    if(Math.ceil(a / c) < Math.ceil(b / d)){
      ans = "No";
    } else {
      ans = "Yes";
    }

    System.out.println(ans);
  }
}
