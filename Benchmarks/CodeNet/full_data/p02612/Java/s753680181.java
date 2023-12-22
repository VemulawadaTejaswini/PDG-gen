import java.util.Scanner;

public class test {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int x = 1000;
		while(true) {
			if(x>=N)break;
			x= x+ 1000;
		}
		System.out.println(x - N);

	}
}