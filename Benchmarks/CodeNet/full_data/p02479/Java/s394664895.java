import java.util.Scanner;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double r;
	r = sc.nextDouble();
	
	double S = Math.PI*r*r;
	double l = 2*Math.PI*r;

	System.out.printf("%.4f %.4f\n",S,l);
    }
}