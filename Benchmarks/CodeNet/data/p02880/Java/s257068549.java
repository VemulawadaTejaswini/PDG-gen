import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputN = sc.nextInt();
		boolean division = false;

		for(int i = 2; i < 10; i++) {
			if(inputN % i == 0 && inputN / i <10) {
				division = true;
				break;
			}
		}

		if(division) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}