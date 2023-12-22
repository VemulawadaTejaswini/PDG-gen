public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.next().charAt(0);

		if('a'<=n && n <='z' ) {
			System.out.println('a');
		}else {
			System.out.println('A');
		}
	}
}