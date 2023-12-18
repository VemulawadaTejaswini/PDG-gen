import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		String s = sc.next();
		int min = 1000;
		for(int i = 0; i < s.length() - 2; i++) {
			int n = Math.abs(Integer.parseInt(s.substring(i, i + 3)) - 753);
			if(min > n)min = n;
		}
		System.out.println(min);
	}
	Main(){doIt();}
	public static void main(String[] args) {
		new Main();
	}

}
