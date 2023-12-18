import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] arr = s.split("");
		int count = 0;
		boolean flag = true;

		while (flag) {
			flag = false;
			for (int i = arr.length - 1; i > 0; i--) {
				if ((arr[i].equals("W")) && (arr[i - 1].equals("B"))) {
					arr[i] = "B";
					arr[i - 1] = "W";
					count++;
					flag = true;
				}
			}
		}
		System.out.println(count);
	}
}
