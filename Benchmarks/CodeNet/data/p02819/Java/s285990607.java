import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		boolean judge = true;

		while(judge) {
			if(judgeNum(x)) {
				judge = false;
				System.out.println(x);
			}
			x++;
		}
	}

	private static boolean judgeNum(int x) {
		for(int i = 2;i < x/2;i++) {
			if(x % i == 0){
				return false;
			}
		}
		return true;
	}
}
