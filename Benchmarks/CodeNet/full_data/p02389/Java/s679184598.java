import java.util.Scanner;

abstract class Product {
	
	// check the input values
	public abstract boolean check();
	
	// calcurate area
	public abstract int calcArea();
	
	// calcurate perimeter
	public abstract int calcPerimeter();
}

abstract class Factory {
	
	// create instance of product
	public Product create(int a, int b) {
		return createProduct(a, b);
	}
	
	// create instance of product
	protected abstract Product createProduct(int a, int b);
}

final class RectangleProduct extends Product {

	private int a;
	private int b;
	
	public RectangleProduct(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	// calcurate area
	@Override
	public int calcArea() {
		
		return a * b;
	}

	// calcurate perimeter
	@Override
	public int calcPerimeter() {
		
		return 2 * a + 2 * b;
	}

	// check the input values
	@Override
	public boolean check() {
		
		if ((a >= 1 && a <= 100) && (b >= 1 && b <= 100)) {
			return true;
		}
		
		return false;
	}
}

final class RectagleFactory extends Factory {

	// create instance of product
	@Override
	protected Product createProduct(int a, int b) {
		
		return new RectangleProduct(a, b);
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Factory f = new RectagleFactory();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		Product p = f.create(a, b);
		if (p.check()) {
			System.out.printf("%d %d\n", p.calcArea(), p.calcPerimeter());
		}
	}

}

