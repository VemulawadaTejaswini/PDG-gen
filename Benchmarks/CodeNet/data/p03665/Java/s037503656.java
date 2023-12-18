import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int ans = 0;
		int n = sc.nextInt();
		int p = sc.nextInt();
		for(int in=1; in<=n; in++){
			int a = sc.nextInt();
			for(int i=0; i<=a; i++){
				if( i % 2 == p ){
					ans++;
				}
			}
		}
		// 出力
		System.out.println(ans);
	}
}