import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		long x= scanner.nextLong();
		long y=scanner.nextLong();
		
		long cnt=0;
		long tar=x;
		while(tar<=y) {
			cnt++;
			tar*=2;
		}
		
		System.out.println(cnt);
	}
}
