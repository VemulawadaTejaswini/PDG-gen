import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int com;
		String result = "";
		if(a > b) {
			com = b;
			for(int i = 0;i < a;i++) {
				result += String.valueOf(com);
			}
		}else {
			com = a;
			for(int i = 0;i < b;i++) {
				result += String.valueOf(com);
			}
		}
		System.out.println(result);
	}

}
