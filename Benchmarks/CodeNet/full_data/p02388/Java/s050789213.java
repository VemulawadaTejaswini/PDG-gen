public class Main {
	public static void main(String[] args) {
		int arg = Integer.decode(args[0]);
		int answer = arg * arg * arg;
		System.out.print(answer);
	}
}