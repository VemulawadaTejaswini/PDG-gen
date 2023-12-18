import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int plug = 1;
		int tap = 0;
		while (plug < b) {
			plug += a - 1;
			tap++;
		}
		
		System.out.println(tap);
		
		sc.close();
	}
}
