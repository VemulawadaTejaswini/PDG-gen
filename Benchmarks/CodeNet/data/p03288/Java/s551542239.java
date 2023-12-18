import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if(i < 1200)
			System.out.println("ABC");
		else if(i < 2800)
			System.out.println("ARC");
		else
			System.out.println("AGC");
	}
}