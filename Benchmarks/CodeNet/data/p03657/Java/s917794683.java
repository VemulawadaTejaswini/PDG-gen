import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		if ((a+b) / 3 == 0){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}

		sc.close();
	}
}