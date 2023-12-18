import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		ARC069ASolve system = new ARC069ASolve();
		system.main();
	}
}

class ARC069ASolve {
	
	long S;
	long C;
	
	ARC069ASolve() {
		Scanner cin = new Scanner(System.in);
		S = cin.nextLong();
		C = cin.nextLong();
	}
	
	void main() {
		long count = 0;	
		if (S * 2 <= C) {
			count += S;
			C -= 2 * S;
			count += C / 4;
		} else {
			count += C / 2;
		}
		System.out.println(count);
	}
}
