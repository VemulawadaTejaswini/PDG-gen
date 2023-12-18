import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = b;

		if(a<13)ans/=2;
		if(a<6)ans=0;

		// 出力
		System.out.println(ans);
	}
}