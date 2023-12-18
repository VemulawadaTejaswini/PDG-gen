import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if (a-c > 0){
//			System.out.println("a-c");
			if (d>=a-c){
				System.out.println("Yes");
				return;
			}
		}
		else {
//			System.out.println("c-a");
			if (d>= c-a){
				System.out.println("Yes");
				return;
			}
		}
		if (a-b > 0){
			if (d>=a-b){
				if (b-c > 0){
					if (d>=b-c){
						System.out.println("Yes");
						return;
					}
				}
				else {
					if (d>=c-b){
						System.out.println("Yes");
						return;
					}
				}
			}
			else {
				if (b-c > 0){
					if (d>=b-c){
						System.out.println("Yes");
						return;
					}
				}
				else {
					if (d>=c-b){
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		else {
			if (d>=b-a){
				if (b-c > 0){
					if (d>=b-c){
						System.out.println("Yes");
						return;
					}
				}
				else {
					if (d>=c-b){
						System.out.println("Yes");
						return;
					}
				}
			}
			else {
				if (b-c > 0){
					if (d>=b-c){
						System.out.println("Yes");
						return;
					}
				}
				else {
					if (d>=c-b){
						System.out.println("Yes");
						return;
					}
				}
			}
			
		}
		System.out.println("No");
	}

}
