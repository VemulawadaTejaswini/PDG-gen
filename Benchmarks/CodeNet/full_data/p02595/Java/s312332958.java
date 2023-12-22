import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc        = new Scanner(System.in);
		String  firstLine = sc.nextLine();

		Integer paramN    = Integer.valueOf(firstLine.split(" ")[0]);
		Integer paramD    = Integer.valueOf(firstLine.split(" ")[1]);

		int count = 0;

		for(int i = 0; i < paramN; i++) {
			String thisLine = sc.nextLine();
			Integer x = Integer.valueOf(thisLine.split(" ")[0]);
			Integer y = Integer.valueOf(thisLine.split(" ")[0]);
			Integer distance = (x * x) + (y * y);

			if(distance < (paramD * paramD)) {
				count++;
			}
		}
		System.out.println(count);
	}
}