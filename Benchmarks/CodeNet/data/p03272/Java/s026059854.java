import java.util.Scanner;

import org.apache.commons.lang3.builder.EqualsBuilder;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i = scanner.nextInt();

		System.out.println(n - i + 1);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}