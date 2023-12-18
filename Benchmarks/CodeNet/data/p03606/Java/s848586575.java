import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		for(int i = 0; i < n; i++) {
			int r = sc.nextInt(), l = sc.nextInt();
			result += (l-r+1);
		}
		System.out.print(result);
	}

}
