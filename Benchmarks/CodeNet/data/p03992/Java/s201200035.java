public class Main {

	public static void main(String[] args) {
		String firstPart = args[0].substring(0, 4);
		String secondPart = args[0].substring(4, 12);
		System.out.println(firstPart + " " + secondPart);
	}

}
