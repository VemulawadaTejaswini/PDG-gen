import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int h=sc.nextInt();
		int a=sc.nextInt();
		int c=0;
		while(h>0) {
			h-=a;
			c++;
		}
		System.out.println(c);
		sc.close();
	}
}
