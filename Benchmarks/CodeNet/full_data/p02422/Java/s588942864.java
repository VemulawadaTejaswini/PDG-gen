import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// String s = "abcde";
		// print(s, 0, 3);
		// System.out.println(reverse(s, 1, 3));
		// System.out.println(reverse(s, 1, 1));
		// System.out.println(replace(s, 0, 4, "ab"));

		Scanner sc = new Scanner(System.in);
		String input1 = "";
		String input2 = "";
		String input3 = "";
		String[] output;
		String[] data;
		String[] Command = { "print", "reverse", "replace" };
		String str = "";
		boolean judge_str = true;
		boolean judge_q = true;
		boolean judge_command = true;

		int q = 0;
		int a = 0;
		int b = 0;
		int printcount = 0;

		input1 = sc.nextLine();
		str = input1;

		if (str.length() < 1 || str.length() > 1000) {
			judge_str = false;
		}

		if (str.equals(str.toLowerCase()) == false) {
			judge_str = false;
		}

		if (judge_str == true) {
			input2 = sc.nextLine();
			q = Integer.parseInt(input2);
			output = new String[q];

			if (q < 1 || q > 100) {
				judge_q = false;
			}

			if (judge_q == true) {

				for (int i = 0; i < q; i++) {
					input3 = sc.nextLine();
					data = input3.split(" ");
					a = Integer.parseInt(data[1]);
					b = Integer.parseInt(data[2]);
					if (data[0].equals(Command[0])) {
						output[printcount] = print(str, a, b);
						printcount++;
					} else if (data[0].equals(Command[1])) {
						str = reverse(str, a, b);
					} else if (data[0].equals(Command[2])) {
						str = replace(str, a, b, data[3]);
					} else {
						judge_command = false;
					}
				}

				if (judge_command == true) {

					for (int j = 0; j < printcount; j++) {
						System.out.println(output[j]);

					}
				}

			}

		}

	}

	public static String print(String s, int start, int end) {
		return s.substring(start, end + 1);

	}

	public static String reverse(String s, int start, int end) {
		String restring = "";
		for (int i = end; i >= start; i--) {
			restring += "" + s.charAt(i);
		}
		return s.substring(0, start) + restring
				+ s.substring(end + 1, s.length());
	}

	public static String replace(String s, int start, int end, String t) {

		return s.substring(0, start) + t + s.substring(end + 1, s.length());
	}
}

