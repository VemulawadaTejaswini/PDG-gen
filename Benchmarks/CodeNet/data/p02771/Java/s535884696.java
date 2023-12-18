import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if(A==B && A!=C) {
			System.out.println("Yes");
		}
		else if(B==C && A!=C) {
			System.out.println("Yes");
		}
		else if(A==C && A!=B) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}

}
