import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int pricetotal = 0, numtotal = 0, count = 0;
		String[] strings;

		while(sc.hasNext()){
			count++;
			strings = sc.next().split(",");

			pricetotal += Integer.parseInt(strings[0]) * Integer.parseInt(strings[1]);
			numtotal += Integer.parseInt(strings[1]);
		}

		System.out.println(pricetotal);
		System.out.printf("%.0f\n", (double)numtotal / (double)count);
	}
}