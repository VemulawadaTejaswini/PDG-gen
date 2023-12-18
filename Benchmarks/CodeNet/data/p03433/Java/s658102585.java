public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int A = in.nextInt();
		if(N%500>A) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		in.close();
	}
}