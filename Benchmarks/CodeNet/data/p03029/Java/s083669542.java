import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int kakera = 0;
		int pie = 0;

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int p = sc.nextInt();

		kakera = a*3 + p;

		while(kakera > 0) {
			kakera = kakera -2;
			if(kakera >= 1) {
				pie++;
			}
		}

		System.out.println(pie);
	}
}
