import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int d = sc.nextInt();
		System.out.print("Christmas ");
		for(int i = 0; i < 25 - d; i++) {
			System.out.print("Eve ");
		}
		System.out.println();
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
