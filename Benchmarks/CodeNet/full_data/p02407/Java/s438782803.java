import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int A = sc.nextInt();
		int[] arrayInt = new int[A];

		for(int i = 0; i < A; i++) {
			int Num = sc.nextInt();
			arrayInt[i] = Num;
		}

		for(int j = A-1; 0 < j; j--) {
			System.out.print(arrayInt[j]+" ");
		}
		System.out.println(arrayInt[0]);
	}
}