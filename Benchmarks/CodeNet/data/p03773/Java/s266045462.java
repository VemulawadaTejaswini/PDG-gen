import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ABC057ASolve solve = new ABC057ASolve();
		solve.main();
	}
}

class ABC057ASolve {
	
	int A;
	int B;
	
	ABC057ASolve() {
		Scanner cin = new Scanner(System.in);
		this.A = cin.nextInt();
		this.B = cin.nextInt();
	}
	
	void main() {
		System.out.println((A + B) % 24);
	}
}
