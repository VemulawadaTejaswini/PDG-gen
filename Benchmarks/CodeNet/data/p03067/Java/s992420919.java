import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();


		boolean f = true;
		if(a > b) {
			for(int i = b; i <= a; i++) {
				if(i == c) {
					f = false;
					break;
				}
			}
		}else {
			for(int i = a; i <= b; i++) {
				if(i == c) {
					f = false;
					break;
				}
			}
		}


		if(!f) {
			System.out.println("Yes");
		}else if(f){
			System.out.println("No");
		}
	}
}