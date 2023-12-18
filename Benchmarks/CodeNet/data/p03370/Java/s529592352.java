import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		int n=stdin.nextInt();
		int x=stdin.nextInt();
		int sum=0;
		int y=0;
		int min=10000;
		for(int i=0;i<n;i++) {
			y=stdin.nextInt();
			sum=sum+y;
			if(y<min) {
				min=y;
			}
		}
		System.out.println(n+(x-sum)/min);
		

	}

}
