import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long i=1;
		while(true) {
			if(n==0) {
				break;
			}
			if(i<10) {
				System.out.println(i);
				n--;
			}else {
				if(i%10==9) {
					System.out.println(i);
					n--;
				}
			}
			i++;
		}
		sc.close();
	}


}
