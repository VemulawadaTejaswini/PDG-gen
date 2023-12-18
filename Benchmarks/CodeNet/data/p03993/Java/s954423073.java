import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scanner.nextInt();
			}
			int count = 0;	
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					if (arr[i] == j+1 && arr[j] == i+1) {
						count++;
					}
				}	
			}		
			System.out.println(count);	
		}
	
	}
}