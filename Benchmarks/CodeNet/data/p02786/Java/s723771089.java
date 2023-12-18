import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long h=sc.nextLong();
		long c=0;
		long i=0;
		while(h>0) {
			h/=2;
			if(c==0) {
				c=1;
				i++;
			}else {
				i = i*2;
				c += i;
			}
		}
		System.out.println(c);
		sc.close();
	}
}
