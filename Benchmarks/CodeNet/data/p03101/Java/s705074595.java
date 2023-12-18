import java.util.*;
public class whitecells {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int W = in.nextInt();
		int h = in.nextInt();
		int w = in.nextInt();
		System.out.println((H-h)*(W-w));
	}
}
