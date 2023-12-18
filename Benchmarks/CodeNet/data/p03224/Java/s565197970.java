import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n % 3 != 0){
			System.out.println("No");
		}
		else {
			for(int i = 0; i < n; i++){
				System.out.println("2 "+(i%n + 1)+" "+ ((i+1)%n + 1));
			}
		}
	}

}
