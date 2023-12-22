import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long num = 0;
		int count = 0;
		
		for(int i = 1; i < n; i++) {
			for(int j = 1; j < n; j++) {
				
				if((n-j) % i == 0) {
					if((n-j) / i == i){
						count++;
					}
					else {
						count+= 1;
					}
				}
			}
		}
		System.out.print(count);

	}

}