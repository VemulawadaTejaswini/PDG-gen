import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		long q = k/50;
		long r = k%50;
		System.out.println("50");
		for (int i=0;i<49;i++) {
			if(i<r) {
				System.out.print(q+100-r);
			}
			else {
				System.out.print(q+50-r-1);
			}
			System.out.print(" ");
		}
		System.out.println(q+50-r-1);
	}

}
