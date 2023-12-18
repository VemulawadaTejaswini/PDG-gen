import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean found = false;
		for(int i = b; i < b * 2; i++ ) {
			if(i * a % b == c) {
				found = true;
				break;
			}
		}
		if(found) System.out.println("YES");
		else System.out.println("NO");
	}

}
