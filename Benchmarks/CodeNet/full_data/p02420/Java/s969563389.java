import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int n;
		int[] array; int[] box; int t;
		while (str.equals("-") == false) {
			n = scan.nextInt();
			array = new int[str.length()];
			box = new int[str.length()];
			for (int i = 0; i < str.length(); i++) {
				array[i] = i;
			}
			for (int i = 0; i < n; i++) {
				t = scan.nextInt();
				for (int j = 0; j < array.length; j++) {
					box[j] = array[(j + t) % array.length];
						
				}
				for (int j = 0; j < array.length; j++) {
					array = (int[])box.clone();
				}
				//System.out.println(box[0]+" "+box[1]+" "+box[2]+" "+box[3]+" "+box[4]);
			}
			for (int j = 0; j < str.length(); j++) {
				System.out.print(str.charAt(box[j]));
			}
			System.out.println();
			str = scan.next();
		}
	}

}