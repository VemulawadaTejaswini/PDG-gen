import java.util.Scanner;
public class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int h = scn.nextInt();
      int w = scn.nextInt();
      int H -= 1;
      int W -= 1;
      int ans;
      if(H%2 == 0){
      	ans = W*(H/2);
      } else {
      	ans = W*((int)Math.floor(H/2));
        ans += (int)Math.ceil(W/2);
      }
      System.out.println(ans);
    }
}
