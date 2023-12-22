import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();

		int i=0;
		while(true) {
			if(i%2==0) {
				c -= b;
			}else {
				a -= d;
			}
			if(c<=0) {
				System.out.println("Yes");
				break;
			}
			if(a<=0) {
				System.out.println("No");
				break;
			}
			i++;
		}
		sc.close();
	}


}