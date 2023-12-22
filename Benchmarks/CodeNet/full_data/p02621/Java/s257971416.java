import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int ans = 0;
		int in = s.nextInt();
		ans = in+(int)Math.pow(in,2)+(int)Math.pow(in,3);
		System.out.print(ans);	
	}
}