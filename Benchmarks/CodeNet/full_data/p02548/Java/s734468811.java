import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= n - 1; i++) {
			int n2 = n - i;
			
			for(int j = 1; j <= n2; j++) {
				int temp = n2 / j;
				if(((double)n2 / j) == temp){
					count++;
				}
			}
			
		}
		
		System.out.println(count);
		
	}

}
