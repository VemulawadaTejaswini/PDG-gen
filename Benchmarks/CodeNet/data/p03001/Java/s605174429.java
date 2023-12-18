import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      double W = sc.nextDouble();
      double H = sc.nextDouble();
      double x = sc.nextDouble();
      double y = sc.nextDouble();
      double ans = W*H/2.0;
      String met = "0";
      if(W/2.0==x && H/2.0==y){
        met = "1";
      }
      System.out.println(ans+" "+met);
    }
}