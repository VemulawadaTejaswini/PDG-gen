import java.util.Scanner;

class Circle {
	private int _x;
	private int _y;
	private int _r;
	
	public Circle(int x, int y, int r) {
		_x = x;
		_y = y;
		_r = r;
	}
	public int getX() { return _x; }
	public int getY() { return _y; }
	public int getR() { return _r; }
}

class Rectangle {
	private int _w;
	private int _h;
	public Rectangle(int w, int h) {
		_w = w;
		_h = h;
	}
	public int getW() { return _w; }
	public int getH() { return _h; }
}

class CircleInRectangle {
	private Circle circle;
	private Rectangle rectangle;
	
	CircleInRectangle(int w, int h, int x, int y, int r) {
		circle = new Circle(x, y, r);
		rectangle = new Rectangle(w, h);
	}
	
	public void control() {
		System.out.println(toString(isIncluded()));
	}
	
	private boolean isIncluded() {
		if (rectangle.getW() - circle.getR() < circle.getX())
			return false;
		if (rectangle.getH() - circle.getR() < circle.getY())
			return false;
		return true;
	}
	
	private String toString(boolean isIncluded) {
		if (isIncluded)
			return "Yes";
		return "No";
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		new CircleInRectangle(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt()).control();

	}

}

