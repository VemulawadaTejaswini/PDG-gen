import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int A = s.nextInt();
		
		System.out.println((N%500) <= A ? "Yes" : "No");
		
	}

}