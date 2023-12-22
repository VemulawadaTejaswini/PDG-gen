import java.util.Scanner;
class Main {
	public void pi() {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int x = sc.nextInt();
		while(x != 0) {
			System.out.println("Case" + " " + i + ":" + " " + x);
			x = sc.nextInt();
			i++;
		}
	}
	public static void main(String[] args) {
		new Main().pi();
	}
}