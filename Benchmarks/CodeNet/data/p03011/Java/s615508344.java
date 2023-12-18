import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt(),q=sc.nextInt(),r=sc.nextInt();
		int ans;
		ans = Math.min(p+q, q+r);
		ans = Math.min(ans, r+p);
		
		System.out.println(ans);
		
	}

}
