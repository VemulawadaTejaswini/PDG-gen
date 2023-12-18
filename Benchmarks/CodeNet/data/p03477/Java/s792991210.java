import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int left = sc.nextInt() + sc.nextInt();
		int right = sc.nextInt() + sc.nextInt();

		if(left > right){
			System.out.println("Left");
		}else if(right > left){
			System.out.println("Right");
		}else{
			System.out.println("Balanced");
		}

		sc.close();
	}

}
