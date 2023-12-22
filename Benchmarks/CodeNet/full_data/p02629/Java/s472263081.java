import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		List<Character> list = new ArrayList<>();
		while (N >= 1) {
			int rest = 0;
			rest = (int) N % 26;
			N /= 26;
			switch (rest) {
			case 1:
				list.add('a');
				break;
			case 2:
				list.add('b');
				break;
			case 3:
				list.add('c');
				break;
			case 4:
				list.add('d');
				break;
			case 5:
				list.add('e');
				break;
			case 6:
				list.add('f');
				break;
			case 7:
				list.add('g');
				break;
			case 8:
				list.add('h');
				break;
			case 9:
				list.add('i');
				break;
			case 10:
				list.add('j');
				break;
			case 11:
				list.add('k');
				break;
			case 12:
				list.add('l');
				break;
			case 13:
				list.add('m');
				break;
			case 14:
				list.add('n');
				break;
			case 15:
				list.add('o');
				break;
			case 16:
				list.add('p');
				break;
			case 17:
				list.add('q');
				break;
			case 18:
				list.add('r');
				break;
			case 19:
				list.add('s');
				break;
			case 20:
				list.add('t');
				break;
			case 21:
				list.add('u');
				break;
			case 22:
				list.add('v');
				break;
			case 23:
				list.add('w');
				break;
			case 24:
				list.add('x');
				break;
			case 25:
				list.add('y');
				break;
			case 0:
				list.add('z');
				break;
			}

		}
		for (int i = list.size(); i > 0; i--) {
			System.out.print(list.get(i-1));
		}

	}

}
