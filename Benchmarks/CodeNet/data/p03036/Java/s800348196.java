import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int r           = scanner.nextInt();
		int D           = scanner.nextInt();
		int x           = scanner.nextInt();
		int answer      = 0;
		//10行出力
		for(int i = 0; i <= 9; i++){
			
			answer = r * x - D;
			//xを一つ前の値にする
			x = answer;
			System.out.println(answer);
		}
	}

}