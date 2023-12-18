import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int min=2020;
		for(int i=l;i<r;i++) {
			for(int j=i+1;j<=r;j++) {
				if((i*j)%2019<min) min=(i*j)%2019;
			}
		}
		
		System.out.println(min);
	}
}