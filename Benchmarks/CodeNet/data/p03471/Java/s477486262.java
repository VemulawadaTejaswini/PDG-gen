import java.util.Scanner;

// https://atcoder.jp/contests/abc085/tasks/abc085_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int y = scanner.nextInt();

		boolean flag = true;
		loop: for(int a=0;a<=n;a++){
			for(int b=0;b<=n-a;b++) {
				for(int c=0;c<=n-a-b;c++) {
					if(10000*a+5000*b+1000*c==y) {
						System.out.println(a+" "+b+" "+c);
						flag = false;
						break loop;
					}
				}
			}
		}

		if(flag) {
			System.out.println(-1+" "+-1+" "+-1);
		}
		scanner.close();
	}
}