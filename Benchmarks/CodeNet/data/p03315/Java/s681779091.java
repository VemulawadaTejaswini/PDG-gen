
public class Main {

	public static void main(String[] args) {

		int number = 0;

		String a = args[0];

		for (int i = 0; i < a.length(); i++) {
			char x = a.charAt(i);
			String y = String.valueOf(x);
			if (y.equals("+")) {
				number++;
			} else if (y.equals("-")) {
				number--;
			}
		}

		System.out.println(number);

	}

}
