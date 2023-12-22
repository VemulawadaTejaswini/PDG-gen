public class Main {
	public static void main(String[] args) throws Exception {
		String hello = "Hello World\n";
		String stack = hello;
		for (int i = 2; i <= 100000; i++) {
			stack = stack + hello;
		}
		System.out.print(stack);
	}
}