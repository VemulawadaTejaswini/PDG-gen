import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int ans =0;
		int nans =0;
		int x = 1;
		while(x <=n){
			ans = (int)(a*x/b) - a * (int)(x/b);
			if(ans < nans){
				System.out.println(nans);
				return;
			}
			nans = ans;
			x++;
		}
		System.out.println(nans);
    }
}