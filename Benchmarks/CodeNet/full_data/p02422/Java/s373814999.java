import java.util.Scanner;

class Command {

	private String method;
	private int a;
	private int b;
	private String p;

	public Command(String input) {
		super();

		String[] parts = input.split(" ");

		this.method = parts[0];
		this.a = Integer.parseInt(parts[1]);
		this.b = Integer.parseInt(parts[2]);

		if(parts.length == 4) this.p = parts[3];
	}

	public String doMethod(String str) {

		switch (this.method) {
		case "print":

			System.out.println(str.substring(a, b+1));
			break;

		case "reverse":

			char[] reverse = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				if(a <= i && i <= b) {
					reverse[i] = str.charAt(b-(i-a));
				} else {
					reverse[i] = str.charAt(i);
				}
			}
			str = new String(reverse);
			break;

		case "replace":

			char[] replace = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				if(a <= i && i <= b) {
					replace[i] = p.charAt(i-a);
				} else {
					replace[i] = str.charAt(i);
				}
			}
			str = new String(replace);
			break;

		default:
			break;
		}

		return str;
	}
}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int num = sc.nextInt();
		sc.nextLine();

		Command[] commands = new Command[num];
		for (int i = 0; i < num; i++) {

			String input = sc.nextLine();
			commands[i] = new Command(input);

		}
		sc.close();

		for(Command command : commands) {
			str = command.doMethod(str);
		}

	}
}