import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner stdin = new Scanner(System.in);
			int arr[] = new int[3000];
			int i = 0, temp = 0;
			do {
				i++;
				arr[i] = stdin.nextInt();
			} while (arr[i] != 0 );

			for (i = 1; i < arr.length; i += 2) {
				if (arr[i] == 0) {
					break;
				} else {
					if(arr[i]> arr[i+1]) {
						System.out.println(arr[i+1] + " " + arr[i]);
					}else {
						System.out.println(arr[i] + " " + arr[i+1]);
					}
				}
			}
		}
}