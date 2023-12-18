import java.util.*;

class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a;
		int b;
		int c=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		if(b>=a) {
			c=a;
		}else {
			c=a-1;
		}
		System.out.println(c);
	}

}
