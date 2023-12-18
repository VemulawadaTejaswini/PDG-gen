import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String N = scanner.nextLine();
		if("1".equals(N)){
			System.out.print("Hello World");
		}else{
			scanner.hasNextLine();
			String A = scanner.nextLine();
			scanner.hasNextLine();
			String B = scanner.nextLine();
			System.out.print(Integer.parseInt(A) + Integer.parseInt(B));
		}
	}

}
