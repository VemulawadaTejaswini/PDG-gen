import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			StringBuffer str = new StringBuffer(sc.nextLine());
			String ret = new String();
			int i, length = str.length();
			for (i = 0; i < length; i++) {
				ret = ret + str.charAt(str.length() - 1);
				str.deleteCharAt(str.length() -1);
			}
			System.out.println(ret);
		}
	}
}