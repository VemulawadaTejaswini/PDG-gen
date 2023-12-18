public class Main {
	public static void main(String[] args) {
		String str = args[0];
		String strFirst = str.substring(0, 4);
		String strLast = str.substring(4);
		str = strFirst + " " + strLast + "\n";
		System.out.print(str);
	}
}

