import java.util.*;

public class Main{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		for(int i = 0; i < n; ++i){
			int h = sc.nextInt();
			if(h >= k) ++ans;
		}
		System.out.println(ans);
	}
}