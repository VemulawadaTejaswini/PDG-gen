import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//入力から、値を取ってくる。
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		
		//for文を回して、Aの値を足した後に、あまりの計算を実施する。
		long seki=0;
		for(int i=1; i<=10000000; i++) {
			seki += a;
			if(seki%b==c) {
				System.out.println(i);
				System.out.println("YES");
				System.exit(0);;
			}
		}
		System.out.println("NO");
		
		// あまりが入力された内容と一致するならば、YESの出力を実施する。
		
	}
}
