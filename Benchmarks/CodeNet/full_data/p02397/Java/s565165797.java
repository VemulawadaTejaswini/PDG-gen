import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3000];
		int[] num2 = new int[3000];
		for (int i = 0; i < 3000; i++) {
			String line = sc.nextLine();
			String[] ss = line.split(" ");
			num[i] = Integer.parseInt(ss[0]);
			num2[i] = Integer.parseInt(ss[1]);
			if (num[i] == 0 && num2[i] == 0) {
				break;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 0 && num2[i] == 0) {
				break;
			}
			if (num[i] < num2[i]) {
				System.out.println(num[i] + " " + num2[i]);
			}
			if (num[i] > num2[i]) {
				System.out.println(num2[i] + " " + num[i]);
			}
			if (num[i] == num2[i]) {
				System.out.println(num[i] + " " + num2[i]);
			}
		}
	}
}