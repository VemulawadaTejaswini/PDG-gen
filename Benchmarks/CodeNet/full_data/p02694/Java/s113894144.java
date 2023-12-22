import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long n = 100;

		int i=0;
		while(n<x) {
			n = n + (long)(0.01 * n);
			i++;
		}
		System.out.println(i);
		sc.close();
	}


}