import java.util.BitSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();

		BitSet bit = new BitSet();
		bit.set(s);

		int count = 1;
		boolean check = true;
		while(check) {
			if(s % 2 == 0) s /= 2;
			else s = s * 3 + 1;
			count += 1;

			if(bit.get(s)) check = false;
			else bit.set(s);
		}

		System.out.print(count);
	}
}