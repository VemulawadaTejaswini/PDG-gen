import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = 0;
		int cnt = 2;
		int tmp = 1;

		while(tmp <= a){
			tmp = tmp + cnt;
			cnt++;
			//System.out.println("tmp" +tmp);
			//System.out.println("cnt" + cnt);
		}

		int west = tmp;
		int east = west + cnt;
		x = (west * b - east * a) / (east - west);

		// 出力
		//System.out.println(west);
		//System.out.println(east);
		System.out.println(x);
	}
}