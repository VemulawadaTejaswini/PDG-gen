import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		int n = 0;
		for(int i=0; i<3; i++)
			if(s.charAt(i) == 'o') n++;
		
		System.out.println(700+100*n);
	}
}