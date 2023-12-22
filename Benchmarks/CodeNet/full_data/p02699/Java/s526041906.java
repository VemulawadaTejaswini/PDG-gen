import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		int w = scan.nextInt();
		
		if(s > w) {
			System.out.println("safe");
		}else {
			System.out.println("unsafe");
		}
		
	}

}
