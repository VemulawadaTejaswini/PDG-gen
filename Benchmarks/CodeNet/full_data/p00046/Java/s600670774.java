import java.util.*;
import static java.lang.Math.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float max = Float.MIN_VALUE, min = Float.MAX_VALUE;
		while(in.hasNext()) {
			float h = in.nextFloat();
			max = max(max, h);
			min = min(min, h);
		}
		System.out.println(max-min);
	}
}