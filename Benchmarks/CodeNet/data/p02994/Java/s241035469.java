import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		int l = sc.nextInt();

		int ans = 0;
		int num = 9999;

		for(int i=0;i<n;i++){
			ans += l+i;
			num = abs(num)>abs(l+i)?l+i:num;
		}
		// 出力
		System.out.println(ans-num);
	}

	static int abs(int n){
		return n<0?-n:n;
	}
}