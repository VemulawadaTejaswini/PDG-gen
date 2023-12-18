import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = (B - A)/(A - 1);
		if((B - A)%(A - 1) == 0) {
			System.out.println(C+1);
		}else {
			System.out.println(C+2);
		}
	}
}