import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int W = sc.nextInt();
      int H = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      double ans = (double)(W*H/2);
      String met = "0";
      if(W/2==x && H/2==y){
        met = "1";
      }
      System.out.println(ans+" "+met);
    }
}