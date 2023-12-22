public class Main {

	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine();
		String[] input2 = input.split(" ");
		int W = Integer.parseInt(input2[0]);
		int H = Integer.parseInt(input2[1]);
		int x = Integer.parseInt(input2[2]);
		int y = Integer.parseInt(input2[3]);
		int r = Integer.parseInt(input2[4]);
		if((x + r) <= W && (y + r) <= H && x > 0 && y > 0 && r <= x && r <= y)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}