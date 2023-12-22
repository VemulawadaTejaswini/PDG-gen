import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numA = 0;
		int numB = 0;
		int temp = 0;
		ArrayList<Integer>listA = new ArrayList<Integer>();
		ArrayList<Integer>listB = new ArrayList<Integer>();

		try(Scanner scan = new Scanner(System.in);) {
			while(true) {
				numA = scan.nextInt();
				numB = scan.nextInt();
				if(numA == 0 && numB == 0) {
					break;
				}

				if(numA > numB) {
					temp = numA;
					numA = numB;
					numB = temp;
				}

				listA.add(numA);
				listB.add(numB);
			}
			for(int i = 0; i < listA.size(); i++) {
				System.out.println(listA.get(i) + " " + listB.get(i));
			}
		}
	}
}