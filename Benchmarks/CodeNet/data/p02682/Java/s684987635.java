import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		
		int sum = 0;
		if(k <= a) {
			System.out.println(k);
		}else {
			for(int i = 0; i < a; i++) {
				sum++;
			}
			
			k = k - a - b;
			if(k <= 0) {
				System.out.println(sum);
			}else {
				System.out.println(sum - k);
			}
			
		}
		
		
	}

}
