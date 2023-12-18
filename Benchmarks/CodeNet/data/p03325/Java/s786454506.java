import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String[] temp = scanner.nextLine().split(" ");
		int[] list = new int[temp.length];
		for(int i  = 0; i < temp.length; i++) {
			list[i] = Integer.parseInt(temp[i]);
		}
		int guu = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] % 2 == 0) {
				while(list[i] % 2 == 0) {
				list[i] /= 2;
				guu++;
				}
			}
		}
		System.out.println(guu);
	}
}
