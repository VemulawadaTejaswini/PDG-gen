import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		if(ans == 3 | ans == 5 | ans == 7) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
