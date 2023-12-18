import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		if(n==2||m==2) {
			System.out.println(0);
		}
		else if(n==1&&m==1) {
			System.out.println(1);
		} else {
			if(n==1) {
				System.out.println((m-2));
			} else if(m==1){
				System.out.println((n-2));
			} else {
				System.out.println((n-2)*(m-2));
			}
		}
		sc.close();
	}

}
