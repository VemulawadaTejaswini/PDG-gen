import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int ans = 0;
		for (int i = A; i <= B; i++) {
			if(i%C!=0&&i%D!=0){
				ans++;
			}
		}		
		System.out.println(ans);
	}		
}
