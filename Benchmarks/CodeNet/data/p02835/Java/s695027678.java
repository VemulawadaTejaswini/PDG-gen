import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int C = Integer.parseInt(sc.next());
		sc.close();
		
		//3つの数の値の和で条件分岐
		int check = A + B + C;
		if(check <= 21) {
			System.out.println("win");
		}else {
			System.out.println("bust");
		}
	}
}