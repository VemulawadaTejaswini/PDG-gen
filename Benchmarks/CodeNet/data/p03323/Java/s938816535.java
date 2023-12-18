import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (Math.max(A, B) <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
	
}