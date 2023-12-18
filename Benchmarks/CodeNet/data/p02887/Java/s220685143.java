import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		String s = scanner.nextLine();
		scanner.close();
		
		String[] arr = s.split("");
		int result = 0;
		for (int i = 1; i < arr.length; i++) {
			if(!arr[i - 1].equals(arr[i])) result++;  
		}
		System.out.println(result);
		
	}
}