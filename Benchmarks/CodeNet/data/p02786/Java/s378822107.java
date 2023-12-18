import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long count = 0;
		while (H > 0) {
			count++;
			H /= 2;
		}
		long answer = 1;
		for (int i = 0; i < count; i++) {
			answer *= 2;
		}

		System.out.println(answer - 1);
	}
}
