import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int week = scan.nextInt();
		double debt = 100000;
		
		for(int i = 0; i < week; i++){
			debt = debt * 1.05 / 1000;
			debt = Math.ceil(debt);
			debt = debt * 1000;
		}
		
		int ans = (int)debt;
		System.out.println(ans);

	}

}