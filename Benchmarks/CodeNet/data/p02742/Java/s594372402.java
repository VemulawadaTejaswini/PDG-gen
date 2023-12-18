import java.util.Scanner;
public class Main{
	public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int H = scn.nextInt();
      int W = scn.nextInt();
      int ans = switch(H)
        H%2 = 0 -> ans = W*(H/2);
      	H%2 = 1 -> ans = W*(Math.floor(H/2))+Math.ceil(W/2);
      System.out.println(ans);
    }
}