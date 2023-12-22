import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String h = String.valueOf(i / 60 / 60);
		String m = String.valueOf((i / 60) % 60);
		String s = String.valueOf(i % 60);
		System.out.println(h + ":" + m + ":" + s);

	}
}
