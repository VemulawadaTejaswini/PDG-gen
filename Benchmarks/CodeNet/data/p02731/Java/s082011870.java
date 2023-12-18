import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int l = scanner.nextInt();
		long result = 0;
		for(int i = 1; i <= l-2; i++){
			for(int j = l-i-1; j >= 1; j--){
				int k = l - i - j;
				result = Math.max(result, i*j*k);
//				System.out.println(i+","+j+","+k+" : " + result);
			}
		}
		System.out.println(result);
	}

}
