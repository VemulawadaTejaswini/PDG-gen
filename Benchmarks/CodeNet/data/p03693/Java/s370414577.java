import java.util.Scanner;

public class RGB_Cards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1 = sc.nextInt();
		//System.out.println(data1);
		int data2 = sc.nextInt();
		//System.out.println(data2);
		int data3 = sc.nextInt();
		//System.out.println(data3);

		int data = (data1 * 100) + (data2 * 10) + data3;
		//System.out.println(data);

		if (data % 4 == 0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
