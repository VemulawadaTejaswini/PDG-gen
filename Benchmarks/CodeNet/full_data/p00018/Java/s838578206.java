import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String list[] = sc.nextLine().split(" ");
		Arrays.sort(list);
		
		for(int i = list.length;i > 0; i--) {
			System.out.print(list[i-1] + " ");
		}
	}

}