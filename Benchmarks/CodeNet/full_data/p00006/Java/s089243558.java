import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		char[] a = str.toCharArray();
		for(int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}