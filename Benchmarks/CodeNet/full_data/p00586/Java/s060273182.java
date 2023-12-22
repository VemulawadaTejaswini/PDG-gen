import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		while(sc.hasNext()) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
	}
	public static void main(String[] args) {
		new Main().doIt();
	}

}

