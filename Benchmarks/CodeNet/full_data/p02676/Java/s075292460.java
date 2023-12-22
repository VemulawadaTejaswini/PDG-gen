import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		String str =sc.next();
		
		if(str.length()>num)
			System.out.println(str.substring(0, num)+"...");
		else
			System.out.println(str);

	}

}