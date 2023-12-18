import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int cnt = 2;
		int tmp = 1;

		while(tmp <= a){
			tmp = tmp + cnt;
			cnt++;
			//System.out.println("tmp" + tmp);
			//System.out.println("cnt" + cnt);
		}


		while(tmp <= b){
			tmp = tmp + cnt;
			cnt++;
			//System.out.println("tmp" + tmp);
			//System.out.println("cnt" + cnt);
		}

		int west = tmp;
		int east = west + cnt;
		//int x = (west * b - east * a) / (east - west);
		int x = west - a;

		// 出力
		//System.out.println("west" + west);
		//System.out.println("east" + east);
		System.out.println(x);
	}
}