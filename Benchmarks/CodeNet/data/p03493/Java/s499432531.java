import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int count = 0;
		if(s/100 == 1) {
			count++;
			s -= 100;
		}
		if(s/10 == 1) {
			count++;
			s -= 10;
		}
		if(s == 1) {
			count++;
		}
		System.out.println(count);
	}
}