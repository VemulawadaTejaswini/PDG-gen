public class Main {
	public static void main(String[] args) {
		double pi = Math.PI;
		double r = Double.parseDouble(args[0]);
		double area = r*r*pi;
		double length = 2*r*pi;
		System.out.println(area + " " + length);
	}
}