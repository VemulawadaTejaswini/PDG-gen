import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(s);
		String[] arrInput = s.split(" ");
		
		int hourValue = Integer.parseInt(arrInput[0]) * Integer.parseInt(arrInput[1]);
		int maxValue = Integer.parseInt(arrInput[2]);
		
		System.out.println(hourValue > maxValue ? maxValue: hourValue);

	}

}