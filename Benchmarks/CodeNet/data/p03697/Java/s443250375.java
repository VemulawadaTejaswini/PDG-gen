import java.util.Scanner;
class Test {
	public static void main(String[] a) {
		Scanner s = new Scanner(System.in);
		int i=s.nextInt()+s.nextInt();
		System.out.print(i>=10?"error":i);
	}
}
