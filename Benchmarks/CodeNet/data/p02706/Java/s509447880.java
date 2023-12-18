import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine();
		String[] arr1 = l.split(" ");
		l = sc.nextLine();
		String[] arr2 = l.split(" ");

		int dSum = 0;
		for(String s : arr2) {
			dSum += Integer.valueOf(s);

		}
		int res = Integer.valueOf(arr1[0]) - dSum;
		System.out.println(res > 0 ? res : -1);
		sc.close();
	}
}
