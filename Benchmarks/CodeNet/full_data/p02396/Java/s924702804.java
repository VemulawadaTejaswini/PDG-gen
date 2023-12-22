import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int x = 999;
		while(x != 0) {
			x = sc.nextInt();
			if(x == 0) {
				break;
			} else {
				i++;
				System.out.println("Case " + i + ":" + x);
			}
		}
	}
}