import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int days = scanner.nextInt();
		int last = scanner.nextInt();
		int spans[] = new int[num];
		for(int i=0; i<num; i++) {
			spans[i] = scanner.nextInt();
		}
		int consum = 0;
		for(int span : spans) {
			consum += (int)Math.ceil((double)days / (double)span);
		}
		System.out.println(consum + last);
	}

}