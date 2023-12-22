public class Main {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int S = sc.nextInt();
		int h = S / (60 * 60);
		int m = (S - h*60*60) / 60;
		int s = S - h*60*60 - m*60;
		System.out.println(h + ":" + m + ":" + s);
	}
}