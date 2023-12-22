import java.util.*;

public class Main {
	public static void main(String[] args) {
		float r = 0;
		Scanner in = new Scanner(System.in);
		try {
			r = in.nextFloat();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		in.close();
		System.out.println(Math.pow(r, 2) * Math.PI + " " + 2 * r * Math.PI);
	}
}