import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m;
		int num=0;
		while (true) {
			m = scanner.nextInt();
			num=0;
			if (m== 0) {
				break;
			}

			while(m!=0){
			num+=m%10;
			m/=10;

			}
		System.out.println(num);
		}
		scanner.close();
		System.out.println("");
	}
}