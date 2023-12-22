import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count = 0;
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n-i+1; j++) {
				
				if((n-i) % j == 0) {
					count++;
				}
				
			}
		}
		System.out.print(count);

	}

}