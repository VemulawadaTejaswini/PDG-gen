public static void main(String[] args) {

		if (args[0].equals("AtCoder") && args[2].equals(" Contest ")
				&& args[1].length() > 0 && args[1].length() < 100) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i].substring(0, 1));
			}
 		}

	}