import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		int n = sc.nextInt();
		if(n == 1) {
			System.out.println("Hello World");
		}
		else {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}

