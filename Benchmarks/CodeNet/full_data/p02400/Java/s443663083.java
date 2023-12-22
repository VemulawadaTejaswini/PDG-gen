public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		double circumference = r * 2 * Math.PI ;
		double circle = r * r * Math.PI;
		System.out.println(circumference + " " + circle);
	}
}