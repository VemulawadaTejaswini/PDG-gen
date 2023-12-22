import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			System.out.println(solve(in.nextFloat()));
		};
	}
	static String solve(float w) {
		String ans = "";
		if(w <= 48.00f) ans = "light fly";
		else if(w <= 51.00f) ans = "fly";
		else if(w <= 54.00f) ans = "bantam";
		else if(w <= 57.00f) ans = "feather";
		else if(w <= 60.00f) ans = "light";
		else if(w <= 64.00f) ans = "light welter";
		else if(w <= 69.00f) ans = "welter";
		else if(w <= 75.00f) ans = "light middle";
		else if(w <= 81.00f) ans = "middle";
		else if(w <= 91.00f) ans = "light heavy";
		else ans = "heavy";
		return ans;
	}
}