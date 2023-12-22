import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0021
public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		N = sc.nextInt();
		double[] x = new double[4], y = new double[4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 4; j++) {
				x[j] = sc.nextDouble();
				y[j] = sc.nextDouble();
			}
			
			Complex 
				p1 = new Complex(x[0], y[0]),
				p2 = new Complex(x[1], y[1]),
				p3 = new Complex(x[2], y[2]),
				p4 = new Complex(x[3], y[3]);
			
			if (!isCross(p1, p2, p3, p4)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	static boolean isCross(Complex p1, Complex p2, Complex p3, Complex p4) {
		double det = p1.sub(p2).crossProduct(p3.sub(p4));
		if (Math.abs(det) < Complex.EPS) {
			return false;
		} else {
			return true;
		}
	}
}

class Complex {
	static final double EPS = 1e-10;
	
	double re, im;
	
	Complex (double r, double i) {
		re = r; im = i;
	}

	double arg() {
		return Math.atan2(im, re);
	}
	
	double abs2() {
		return re * re + im * im;
	}
	
	double abs() {
		return Math.sqrt(abs2());
	}
	
	double innerProdut(Complex o) {
		return re * o.re + im * o.im;
	}
	
	double crossProduct(Complex o) {
		return re * o.im - im * o.re;
	}
	
	static Complex polar(double theta, double r) {
		return new Complex(r * Math.cos(theta), r * Math.sin(theta));
	}
	
	Complex conj() {
		return new Complex(re, -im);
	}
	
	Complex add(Complex o) {
		return new Complex(re + o.re, im + o.im);
	}

	Complex sub(Complex o) {
		return new Complex(re - o.re, im - o.im);
	}
	
	Complex mul(Complex o) {
		return new Complex(re * o.re - im * o.im, re * o.im + im * o.re);
	}
	
	Complex div(Complex o) {
		return new Complex((re * o.re + im * o.im) / o.abs2(), (im * o.re - re * o.im) / o.abs2());
	}
}