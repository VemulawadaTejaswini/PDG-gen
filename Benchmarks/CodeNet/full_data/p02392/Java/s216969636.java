import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(0 <= a &&a <= b && b <= 100){
			System.out.println("Yes");
		}
		else if(0 <= b && b <= c && c <= 100){
			System.out.println("Yes");
		}
		else if(0 >= a && a >= b && b >= 100){
			System.out.println("No");
		}
		else if(0 >= b && b >= c && c >= 100){
			System.out.println("No");
		}
		sc.close();

	}

}