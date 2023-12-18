import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int participants = sc.nextInt();
		int days = sc.nextInt();
		int amari = sc.nextInt();
		int[] aida = new int[participants];
		for (int i = 0; i < participants; i++) {
			aida[i] = sc.nextInt();
		}

		int total = amari;
		for (int j = 0; j < participants; j++) {
			int sum = 0;
			for (int k = 0; k < days; ) {
				sum = sum + 1;
				k = k + aida[j];
			}
			total = total+sum;
		}
		System.out.println(total);
	}
}
