import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rec = 0, loz = 0;
		Double side1, side2;
		String[] strings;

		while(sc.hasNext()){
			strings = sc.next().split(",");
			side1 = (double)Integer.parseInt(strings[0]);
			side2 = (double)Integer.parseInt(strings[1]);

			if(Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow((double)Integer.parseInt(strings[2]), 2)) rec++;
			else if(side1 == side2) loz++;
		}

		System.out.println(rec);
		System.out.println(loz);
	}
}