import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(scr.nextLine());
			if (n == 0) break;
			Complex[][] data = new Complex[n + 1][];
			for (int i = 0; i <= n; i++) {
				int m = Integer.parseInt(scr.nextLine());
				Complex[] cplxs = new Complex[m-1];
				String[] strs = scr.nextLine().split(" ");
				int prevX = Integer.parseInt(strs[0]), 
						prevY = Integer.parseInt(strs[1]);
				for (int j = 1; j < m; j++) {
					String[] strsj = scr.nextLine().split(" ");
					int x = Integer.parseInt(strsj[0]);
					int y = Integer.parseInt(strsj[1]);
					cplxs[j-1] = new Complex(x - prevX, y - prevY);
					prevX = x;
					prevY = y;
				}
				data[i] = cplxs;
			}
			PolyLineMatching(data);
			System.out.println("+++++");
		}
		scr.close();
	}

	static void PolyLineMatching(Complex[][] data) {
		ArrayList<Integer> polyLines = new ArrayList<Integer>();
		Complex[] map = { new Complex(1, 0), new Complex(0, 1), new Complex(-1, 0), new Complex(0, -1) };
		for(int k=0; k<map.length; k++){
			Complex[] base = new Complex[data[0].length];
			for(int j=0; j<data[0].length; j++){
				base[j] = data[0][j].Pow(map[k]);
			}
			
			for(int i=1; i<data.length; i++){ //n???????????????
				boolean match = true;
				for(int j=0; j<data[i].length; j++){ //m-1????????????????????????
					if(!base[j].Equal(data[i][j])){
						match = false;
						break;
					}
				}
				if(match) polyLines.add(i);
				
				match=true;
				for(int j=0; j<data[i].length; j++){ //??????
					if(!base[data[i].length - j-1].Pow(-1).Equal(data[i][j])){
						match = false;
						break;
					}
				}
				if(match) polyLines.add(i);
			}
		}
		Collections.sort(polyLines);
		for(int i : polyLines) System.out.println(i);
	}

}

class Complex {
	double real;
	double image;
	final double NORMALIZE = 0.0000000001d;

	Complex(double r, double i) {
		real = r;
		image = i;
	}

	Complex Add(Complex b) {
		return new Complex(this.real + b.real, this.image + b.image);
	}

	Complex Sub(Complex b) {
		return new Complex(this.real - b.real, this.image - b.image);
	}

	Complex Pow(Complex b) {
		return new Complex(this.real * b.real - this.image * b.image, this.real * b.image + this.image * b.real);
	}

	Complex Pow(double k) {
		return new Complex(this.real * k, this.image * k);
	}

	Complex Unit() {
		if (this.Norm() < NORMALIZE)
			return new Complex(0, 0);
		else
			return new Complex(this.real / this.Norm(), this.image / this.Norm());
	}

	Complex Conjugate() {
		return new Complex(this.real, -this.image);
	}

	Complex Div(Complex b) {
		return this.Pow(b.Conjugate()).Pow(1.0d / b.Norm2());
	}
	
	double Dot(Complex b) {
		return this.real * b.real + this.image * b.image;
	}

	double Norm() {
		return Math.sqrt(this.Dot(this));
	}

	double Norm2() {
		return this.Dot(this);
	}

	double Arg() {
		if (this.Norm() <= NORMALIZE)
			return Math.PI / 2;
		return Math.acos(this.real / Math.sqrt(this.real * this.real + this.image * this.image));
	}
	
	void Show() {
		if (this.image == 0) {
			System.out.println(this.real);
			return;
		}
		System.out.println(this.real + ((this.image > 0) ? " +" : " ") + this.image + "i");
	}

	double CrossSize(Complex b) {
		return Math.abs(this.real * b.image - this.image * b.real);
	}

	boolean Equal(Complex b) {
		return (this.real == b.real && this.image == b.image);
	}
}