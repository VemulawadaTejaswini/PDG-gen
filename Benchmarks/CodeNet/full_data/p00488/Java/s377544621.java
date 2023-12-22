import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = 2000;
		int j = 2000;
		for(int i = 0; i < 3; i++) {
			if(p > sc.nextInt())p = sc.nextInt();
			
		}
		for(int i = 0; i < 2; i++) {
			if(j > sc.nextInt())j = sc.nextInt();
		}
		System.out.println(p + j - 50);

	}

}