import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(;num > 1000;) {
			num -= 1000;
		}
		System.out.println(1000-num);
	}
}