public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		StringBuffer input = new StringBuffer(scan.nextLine());
		input.reverse();
		print(input.toString());
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}