import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//入力値X,Kを取得
		int X = scan.nextInt();
		int K = scan.nextInt();
		
		int min = K-(X-1);
		int max = K+(X-1);
		
		int range = max-min;
		int answer = min;
		
		for(int i=0; i <= range; i++) {
						
			System.out.print(answer + " ");
			answer++;
		}
	}
}