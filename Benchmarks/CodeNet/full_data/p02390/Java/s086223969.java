import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int second = scan.nextInt();

		int h = second / 3600;
		int m = (second % 3600) / 60;
		int s = ((second % 3600) % 60);
		
		System.out.println(h + ":" + m + ":" + s);
		
		scan.close();

	}

}