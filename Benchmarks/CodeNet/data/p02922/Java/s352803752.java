import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		int tmpDivision = (int)(B/A);
		int tmpExcess = B%A;
		if (tmpExcess != 0) {
			result = tmpDivision +1;
		}else {
			result = tmpDivision;
		}
		System.out.println(result);
	}
}