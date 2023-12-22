import java.util.Scanner;

public class Main {

	static final String ONE = "1";

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int inputData = sc.nextInt();
			String data = Integer.toBinaryString(inputData);

			StringBuffer sb = new StringBuffer(data);
			String newdata = sb.reverse().toString();

			String[] list = newdata.split("");

			int num = 1;
			
			StringBuilder printData = new StringBuilder();

			for (int i = 1; i < list.length; i++) {
				if (list[i].equals(ONE)) {
					printData.append(num + " ");
					//System.out.print(num + " ");
				}
				num *= 2;
			}
			System.out.println(printData.toString().trim());
		}

	}

}