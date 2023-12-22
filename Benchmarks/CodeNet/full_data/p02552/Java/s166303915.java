import java.util.Scanner;

public class Main {
	static int X;

	public static void main(String[] args) {
		Main prac = new Main();
		prac.execute();
	}

	public void execute() {

		try (Scanner sc = new Scanner(System.in)) {
			X = Integer.parseInt(sc.next());
			if(X==0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
	}
}