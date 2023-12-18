import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();
		scan.close();

		System.out.println(func(h));
	}

	static long func(long h) {
		if(h==1)return 1;
		else return 2*func(h/2)+1;
	}
}