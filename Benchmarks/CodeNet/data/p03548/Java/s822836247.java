import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		sc.close();
		
		int ans = 0;
		int space = X - Z;
		while(true) {
			if(space < Y + Z)break;
			ans++;
			space -= Y + Z;
		}
		System.out.println(ans);
	}
}
