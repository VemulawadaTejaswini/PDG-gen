import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] yohouA   = new char[3];
		char[] zissaiA  = new char[3];

		String yohou  = scanner.nextLine();
		String zissai = scanner.nextLine();

		int count = 0;

		scanner.close();

		tenki(yohou,  yohouA);
		tenki(zissai, zissaiA);

		for(int i=0; i<3; i++) {

			if(yohouA[i] == zissaiA[i]){

				count++;

			}else {

				continue;

			}

		}

		System.out.println(count);

	}

	public static void tenki(String tenki, char[] array) {

		for(int i=0; i<3; i++) {

			array[i] = tenki.charAt(i);

		}

	}


}