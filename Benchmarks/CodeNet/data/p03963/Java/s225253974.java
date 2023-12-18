import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
      int a = (int)Math.pow(k-1,n-1);
      int ans = a*k;
      System.out.print(ans);
	}
}
