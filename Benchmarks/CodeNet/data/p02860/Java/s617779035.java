import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		String s = sc.next();

		if (len % 2 == 0){
			String first = s.substring(0 , len / 2);
			String second = s.substring(len / 2);
			if (first.equals(second)){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} else {
			System.out.println("No");
		}
	}

}