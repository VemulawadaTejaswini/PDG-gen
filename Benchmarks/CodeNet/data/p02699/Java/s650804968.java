import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int W = sc.nextInt();
		String ans = "safe";
		if(W >= S){
			ans = "unsafe";
		}
		System.out.println(ans);
	}
}