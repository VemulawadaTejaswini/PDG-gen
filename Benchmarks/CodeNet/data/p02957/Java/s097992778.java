public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int diff = Math.abs(a-b);
		if(diff%2!=0) {
			System.out.println("IMPOSSIBLE");
		}
		else {
			System.out.println(Math.min(a, b)+diff/2);
		}
	}
}