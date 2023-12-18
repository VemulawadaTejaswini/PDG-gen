
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long cnt = (n/11)*2;
		long m=n%11;
		if(m>0&&m<=6)cnt++;
		if(m>6)cnt += 2;
		System.out.println(cnt);
		sc.close();
	}

}