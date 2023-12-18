import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		int count1 = 0;
		int count2 = 0;
		int a = sc.nextInt();
		if(a == 5) {
			count1 += 1;
		}
		if(a == 7) {
			count2 += 1;
		}
		int b = sc.nextInt();
		if(b == 5) {
			count1 += 1;
		}
		if(b == 7) {
			count2 += 1;
		}
		int c = sc.nextInt();
		if(c == 5) {
			count1 += 1;
		}
		if(c == 7) {
			count2 += 1;
		}
		if(count1 == 2 && count2 == 1) {
			System.out.println("Yes");
		}
		else if (count1 == 1 && count2 == 2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}