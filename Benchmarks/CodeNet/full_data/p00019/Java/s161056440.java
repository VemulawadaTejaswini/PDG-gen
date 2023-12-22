import java.util.*; 

public class Main {
	
	void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(factrical(sc.nextInt()));
	}
	
	long factrical(long x) {
		if (x == 0)
			return 1;
		else return x * factrical(x-1);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
}