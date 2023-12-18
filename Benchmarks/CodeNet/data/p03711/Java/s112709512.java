import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int[] a = new int[] {-1,0,2,0,1,0,1,0,0,1,0,1,0};
		System.out.println(a[x]==a[y]?"Yes":"No");
		sc.close();
	}
}