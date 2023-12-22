import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if(k>=1800) {
			System.out.println(1);
		}
		else if(k>=1600) {
			System.out.println(2);
		}
		else if(k>=1400) {
			System.out.println(3);
		}
		else if(k>=1200) {
			System.out.println(4);
		}
		else if(k>=1000) {
			System.out.println(5);
		}
		else if(k>=800) {
			System.out.println(6);
		}
		else if(k>=600) {
			System.out.println(7);
		}
		else if(k>=400) {
			System.out.println(8);
		}
	}

}
