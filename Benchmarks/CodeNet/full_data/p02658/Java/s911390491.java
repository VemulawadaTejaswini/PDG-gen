import java.util.Scanner;
// A - Multiplication 1
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt(); //

		long ans = sc.nextLong();
		long v = Long.valueOf("1000000000000000000");

		for (int i=0; i < N - 1; i++) {
			ans= ans * sc.nextLong(); //
			if (ans > v) {
				ans = -1;
				break;
			}
		}

		System.out.println(ans);
	}
}