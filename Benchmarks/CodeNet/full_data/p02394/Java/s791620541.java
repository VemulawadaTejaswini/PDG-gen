

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int W = scn.nextInt();
		int H = scn.nextInt();
		int x = scn.nextInt();
		int y = scn.nextInt();
		int r = scn.nextInt();
		scn.close();
		
		System.out.println((x + r <= W && x - r >= 0 && y + r <= H && y - r >= 0)?"Yes":"No");


	}

}
