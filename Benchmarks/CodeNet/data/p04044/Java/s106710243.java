import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] foo =new String[n];
		
		for(int i=0;i<n;i++) {
			foo[i] = sc.nextLine();
		}
		Arrays.sort(foo);
		
		for(int i=0;i<n;i++) {
			System.out.println(foo[i]);
		}
	}
}
