import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int i = 1;
		int Ai;
		while(true) {
			Ai = A * i;
			if(Ai % B == 0) {
				break;
			}
			i++;
		}
		System.out.println(Ai);
	}
}