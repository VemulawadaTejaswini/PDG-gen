import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int n=sc.nextInt();
		int c=0;
		for(int i=0; i<n; i++) {
			c += sc.nextInt();
		}
		if(c>=h) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
