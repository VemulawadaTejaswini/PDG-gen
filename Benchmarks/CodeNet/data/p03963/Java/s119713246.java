import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
      int ans = (int)k*(Math.pow(k-1,n-1));
      System.out.print("ans");
	}
}
