public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		int[] a = new int [10];
		for (int n = 0; n < 10; n++) {
			a[n] = in.nextInt();
		}
		java.util.Arrays.sort(a);
		for (int n = 0; n < 3; n++) {
			System.out.println(a[9 - n]);
		}
	}
	
}