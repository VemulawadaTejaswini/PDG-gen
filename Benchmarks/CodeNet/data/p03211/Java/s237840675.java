import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		int min=Integer.MAX_VALUE;
		for(int i=0;i<str.length()-2;i++) {
			int num = Character.getNumericValue(str.charAt(i))*100 + Character.getNumericValue(str.charAt(i+1))*10 + Character.getNumericValue(str.charAt(i+2));
			min = Math.min(min, Math.abs(num-753));
		}
		System.out.println(min);
	}
}
