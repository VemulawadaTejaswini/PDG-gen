public class Main {


	public static void main(String[] args) {

		double tsubo = 3.305785;

		int vertical  = Integer.parseInt(args[0]);

		int side  = Integer.parseInt(args[1]);

		double land = (vertical * side) / tsubo;

		System.out.println(land);

	}

}