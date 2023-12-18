import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int R=sc.nextInt();
		String ans;

		if(R <1200){
			ans="ABC";
		}else if(R < 2800){
			ans="ARC";
		}else {
			ans="AGC";
		}
		System.out.println(ans);
	}
}