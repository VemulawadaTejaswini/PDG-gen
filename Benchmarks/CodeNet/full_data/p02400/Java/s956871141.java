import java.util.*;

class Main {
    public static void main(String[] args) {
	double r;
	Scanner sc = new Scanner(System.in);
	r = sc.nextDouble();

	double menseki = r * r * Math.PI;
	double shu = 2 * r * Math.PI;

	System.out.printf("%.6f %.6f\n", menseki, shu);
    }
}