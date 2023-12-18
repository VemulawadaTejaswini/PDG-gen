public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if((a+b+c) >= 22) {
		System.out.println("bust");
		}else {
		System.out.println("win");
		}
	}
}