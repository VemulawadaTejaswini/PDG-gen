import java.util*.;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		if(a+b < c) {
			System.out.println("NO");
		} else if (a > c) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
 
}