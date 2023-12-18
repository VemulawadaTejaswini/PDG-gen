import java.util.*;
public class Main implements Runnable { //Runnableを実装する
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MBスタックを確保して実行
	}
	public void run() {
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