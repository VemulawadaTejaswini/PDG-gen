import java.util.Scanner;

public class Main {
	
	public static void countABC(char[] arr) {
		int counter = 0;
		for (int count = 0; count < arr.length - 2; count++) {
			if(arr[count] == 'A' && arr[count + 1] == 'B' &&
				arr[count + 2] == 'C') counter++;
		}
		System.out.println(counter);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.nextInt();
		countABC(scan.next().toCharArray());
		scan.close();
	}

}
