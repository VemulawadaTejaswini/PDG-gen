

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		long count = 1;
		if(n == m){

			for(int i = 2; i <= n; i++){
				count *= i;
				count %= 1000000007;
			}
			for(int i = 2; i <= m; i++){
				count *= i;
				count %= 1000000007;
			}
			count = count * 2 % 1000000007;
			System.out.println(count);
		}else if(n - m == 1 || m-n==1){
			count = getCount(n,m);
			System.out.println(count);
		}else{
			System.out.println(0);
		}
		in.close();
	}
	long getCount(int n,int m){
		long count = 1;
		for(int i = 2; i <= n; i++){
			count *= i;
			count %= 1000000007;
		}
		for(int i = 2; i <= m; i++){
			count *= m;
			count %= 1000000007;
		}
		return count;
	}
}
