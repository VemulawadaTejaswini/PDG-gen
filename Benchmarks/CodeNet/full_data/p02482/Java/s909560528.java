import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		// Scanner型scan変数に標準入力を与える
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); // Scanner型scan変数にnextIntメソッドを命令
		int b = scan.nextInt();
		if(a == b) {
			System.out.println("a == b");
		} else if(a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a < b");
		}
	}
}