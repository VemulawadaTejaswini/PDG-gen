import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		long h = kb.nextLong();
		long count = 0;
		long number = 0;
		while (h != 0) {
			if (h == 1) {
				h = 0;
				count += (long) Math.pow(2, number);
				number += 1;
			} else {
				h = (long) Math.floor(h/2);
				count += (long) Math.pow(2, number);
				number += 1;
			}
		}
		System.out.println(count);
		kb.close();
	}

}
