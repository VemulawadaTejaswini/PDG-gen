import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int int1 = sc.nextInt();
		String str = sc.next();
		int int2 = sc.nextInt();

		if(str.equals("+")){
			System.out.println(int1 + int2);
		}else{
			System.out.println(int1 - int2);
		}
	}
}