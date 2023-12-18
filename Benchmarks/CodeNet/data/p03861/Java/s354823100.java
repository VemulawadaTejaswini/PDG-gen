import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long a = in.nextLong();
		Long b = in.nextLong();
		Long x = in.nextLong();

		long count = 0;
		
		for(int i = 0; i <= a/2; i++) {
			if(a%x==0) {
				count++;
			}
		}
		for(int i = 0; i < b/2;i++) {
			if(b%x==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}