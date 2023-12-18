package test;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int needtime = reader.nextInt();
		int timedBy = reader.nextInt();

		float resultF = (float) (needtime * 1.0 / timedBy);




		System.out.println(resultF);
		reader.close();

	}

}
