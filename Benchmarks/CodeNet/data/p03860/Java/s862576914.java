public class Main {
	public static void main(String[] args) {
		boolean flag = false;

		if (args.length == 3 && args[1].length() < 101
				&& "AtCoder".equals(args[0]) && "Contest".equals(args[2])) {
			if (Character.isUpperCase(args[1].charAt(0))) {
				if (args[1].length() > 1
						&& Character.isLowerCase(args[1].charAt(1))) {
					flag = true;
				} else if (args[1].length() == 1) {
					flag = true;
				}
			}
		}

		if (flag) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i].charAt(0));
			}
		}
	}
}