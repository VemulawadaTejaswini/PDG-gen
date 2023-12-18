import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		char[] arr = sc.nextLine().toCharArray();
		int count = 0;
		char temp = arr[0];
		for(int i = 1;i<size;i++) {
			if(arr[i]!=temp) {
				count++;
				temp = arr[i];
			}
		}
		System.out.println(count+1);

	}

}
