import java.util.Scanner;

class Swapping {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] array = new int[t+1];
		for (int count = 1; count <= t; count++) { 
			array[count] = scan.nextInt();
		}
		scan.close();
		int counter = 0;
		for (int count = 1; count <= t; count++) {
			if(array[count] != count) {
				counter++;
			}
		}
		if(counter == 0 || counter == 2) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}

}
