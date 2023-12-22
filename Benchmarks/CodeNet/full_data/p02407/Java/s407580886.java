import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int array[] = new int[x];
		for (int i = 0; i < array.length; i++) {
			x = sc.nextInt();
			array[i] = x;
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		sc.close();
	}
}
