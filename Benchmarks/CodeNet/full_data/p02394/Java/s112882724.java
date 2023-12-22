public class CircleinaRectangle {
	public static void main (String [] args) {
		boolean out;
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int h = scan.nextInt();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int r = scan.nextInt();

		out = (x - r < 0 ||  x + r > w || y - r < 0 || y +r > h);
		if (out == true) {
			System.out.println("No");
		}else if (out == false) {
			System.out.println("Yes");
		}
		scan.close();



	}

}
