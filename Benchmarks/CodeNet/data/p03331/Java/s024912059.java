import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int min = 0;
		for (int i=1; i < n/2+1; i++) {
			int a = i;
			int b = n - a;
			int tmp = 0;
			tmp += a/1000;
			tmp += (a%1000)/100;
			tmp += (a%100)/10;
			tmp += (a%10);
			tmp += b/1000;
			tmp += (b%1000)/100;
			tmp += (b%100)/10;
			tmp += (b%10);
			if (min==0 || min > tmp) {
				min = tmp;
			}
		}

		System.out.println(min);

	}
}
