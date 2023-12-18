import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		String val1 = sc.next().trim();
		String val2 = sc.next().trim();

		String val1_2 = val1.substring(0, 1) + val1.substring(1,2) + val1.substring(2,3);

		if(val2.equals(val1_2)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

		sc.close();
	}

}
