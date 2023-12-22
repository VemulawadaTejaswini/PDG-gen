import java.util.*;
import java.lang.*;
public class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int n,x,t;
      	n=in.nextInt();
      	x=in.nextInt();
      	t=in.nextInt();
      	int ans=((int)(Math.ceil(n/x))*t);
      	System.out.println(ans);
	}
}