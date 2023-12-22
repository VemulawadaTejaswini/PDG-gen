import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		int cnt=0;
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x*x+y*y <= d*d) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}