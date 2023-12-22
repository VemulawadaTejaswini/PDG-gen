
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int min = 0;
		int max = 0;
		int mid = 0;

		if(a < b && a < c) {
			min = a;
		} else if(b < a && b < c) {
			min = b;
		} else if(c < a && c < b) {
			min = c;
		}

		if(a > b && a > c) {
			max = a;
		} else if(b > a && b > c) {
			max = b;
		} else if(c > a && c > b) {
			max = c;
		}

		if(min < a && a < max) {
			mid = a;
		} else if(min < b && b < max) {
			mid = b;
		} else if(min < c && c < max) {
			mid = c;
		}

		System.out.printf("%d %d %d", min, mid, max);
	}
}