public class Main {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		if(a < b) {
			if(b-a == b-1) {
				System.out.println("Alice");
			}
			else {
				System.out.println("Bob");
			}
		}
		else if(b < a) {
			if(a -b == a-1) {
				System.out.println("Bob");
			}
			else {
				System.out.println("Alice");
			}
		}
		else {
			System.out.println("Drow");
		}

	}

}
