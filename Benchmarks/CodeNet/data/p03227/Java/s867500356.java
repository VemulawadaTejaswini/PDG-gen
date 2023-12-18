public static void main(String[] args) {
		String str = args[0];
		if (str.length() == 2) {
			System.out.println(str);
		} else {
			System.out.print(str.substring(2));
			System.out.print(str.substring(1, 1));
			System.out.println(str.substring(0, 0));
		}

	}