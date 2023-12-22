import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int r = sc.nextInt();
		double menseki = r*r*Math.PI;
		double enshuu = 2*r*Math.PI;
		System.out.println(menseki+" "+enshuu);
	}
}

