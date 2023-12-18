import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b=scanner.nextInt();
		
		int sum=0;
		for(int i=1;i<=999;i++) {
			if(b-a==i) {
				System.out.println(sum-a);
				return;
			}
			sum+=i;
		}
	}
}
