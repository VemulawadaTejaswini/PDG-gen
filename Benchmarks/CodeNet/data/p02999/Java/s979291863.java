import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ここにコードを挿入
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		if(x<a) {
			System.out.println(0);
		}else if(a<=x) {
			System.out.println(10);
		}
		
	}

}