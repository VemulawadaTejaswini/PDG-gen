import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int tmp = x;
		for(int i = 1; i <= 10; i++) {
			tmp = r*tmp - d;
			System.out.println(tmp);
		}
		
		sc.close();
	}
}
