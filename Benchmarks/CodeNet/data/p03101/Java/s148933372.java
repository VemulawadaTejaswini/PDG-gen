import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int H = s.nextInt(), W = s.nextInt(), h = s.nextInt(), w = s.nextInt();
		System.out.println((H - h) * (W - w));
	}
}
