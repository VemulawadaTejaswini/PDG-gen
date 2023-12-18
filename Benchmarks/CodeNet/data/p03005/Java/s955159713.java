import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int k = scn.nextInt();
      	int ans = n-k;
      	if(k==1) ans = 0;
      	System.out.println(ans);
	}
}
