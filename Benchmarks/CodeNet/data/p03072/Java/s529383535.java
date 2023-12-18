import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []h = new int [n];
		
		for(int i = 0; i < n ; i++) {
			h[i] = sc.nextInt();
		}
		int count = 1;
		int max = h[0];
		
		for(int j = 1; j < n ; j++) {
			if(h[j] >= max) {
				max = h[j];
				count++;
			}
			
		}
		System.out.println(count);
			
		

	}

}
