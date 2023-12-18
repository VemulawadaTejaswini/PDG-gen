import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] inArray = in.split(" ");
		int h = Integer.parseInt(inArray[0]);
		int w = Integer.parseInt(inArray[1]);

		String header = createHeader(w);

		System.out.println(header);

		for (int i = 0; i < h ; i++) {
			String inStr = sc.nextLine();
			System.out.println(createLine(inStr));
		}

		System.out.println(header);



		sc.close();
	}

	private static String createHeader(int w) {
		StringBuffer buf = new StringBuffer();
		buf.append("#");
		for (int i = 0 ; i <= w ;i++) {
			buf.append("#");
		}
		return buf.toString();
	}

	private static String createLine(String in) {
		StringBuffer buf = new StringBuffer();
		buf.append("#");
		buf.append(in);
		buf.append("#");
		return buf.toString();
	}

}
