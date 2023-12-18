import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>b) {
			System.out.println(0);
		}else if(a==b) {
			if(c==1) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}else {
			
			if(a*c < b) {
				System.out.println(c);
			}else if(a*c == b){
				System.out.println(c);
			}else {
				System.out.println(a);
			}
		}

	}
}
