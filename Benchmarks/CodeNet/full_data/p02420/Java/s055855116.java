import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド
		Scanner sc = new Scanner(System.in);
		while(true) {
		String str = sc.next();
		if(str.equals("-")) {
			break;
		}
		int a = sc.nextInt();
		for(int i=0;i<a;i++) {
			int b = sc.nextInt();
			str = str.substring(b) + str.substring(0,b);
		}
		System.out.println(str);

	}
	}
}

