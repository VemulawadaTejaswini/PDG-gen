import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int days = input.nextInt();
		int A = input.nextInt();
		long sum = 0;
		boolean valid = true;
		for (int i = 0; i < A; i++) {
			sum+=input.nextInt();
			if (sum>days) {
				valid = false;
				break;
			} 
		}
		System.out.println(valid?(days-sum):-1);
	}
}