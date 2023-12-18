import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//n
		String temp = scanner.nextLine();
		int n = Integer.parseInt(temp);
		//しりとり
		int flag = 0;
		String[] list = new String[n];
		for(int i = 0; i < n; i++) {
			list[i] = scanner.nextLine();
			if(i != 0) {
				if(list[i].charAt(0) != list[i - 1].charAt(list[i - 1].length() - 1)) {
					flag++;
					break;
				}
			}
			for(int j = 0; j < i; j++) {
				if(list[i].equals(list[j])) {
				flag++;
				break;
				}
			}
		}
		if(flag != 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}