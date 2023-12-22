import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		Integer target = sc.nextInt();
		char[] s = target.toString().toCharArray();
		float sum = 0;

		for (int i = 0; i < s.length; i++) {
			sum = sum + s[i];
		}

		if(sum%9==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

		sc.close();
	}
}
