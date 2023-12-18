import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String s = sc.next();
		String ans[] = {s, "red"};
		int an = 0;
		sc.close();
		if(a < 3200)an = 1;
		System.out.println(ans[an]);
	}
}
