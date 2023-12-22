import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int ans = 0;

		for(a=a; a <= b; a++){
			if(c % a == 0){
				ans++;
			}
		}
		System.out.println(ans);

	}

}

