import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char []a = s.toCharArray();
		Arrays.sort(a);
		char b = a[0];
		int count = 0;
		for(int i = 1; i < 4; i++) {
			if(b == a[i]) {
				count++;
			}
			if(b != a[i]) {
				b = a[i];
			}
		}
		if(count == 2) {
		System.out.println("Yes");
		}
		if(count != 2)
			System.out.println("No");
		

	}

}
