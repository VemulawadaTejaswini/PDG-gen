import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while (stdin.hasNext()) {
			int n = stdin.nextInt();
			if (n == 0) break;
			Work work = new Work();
			for (int i = 0; i < n - 1; i++){
				int j = stdin.nextInt();
				int p = stdin.nextInt();
				work.add(j, p);
			} 
			System.out.println(work.getWidth() + " " + work.getHeight());
		}
		System.exit(0);
	}
}

class Work {
	private int xmin = 0;
	private int xmax = 0;
	private int ymin = 0;
	private int ymax = 0;
	private int n = 0;
	private ArrayList<Square> squares = new ArrayList<Square>();

	public Work(){
		addByPoint(0, 0);
	}

	private void addByPoint(int x, int y){
		squares.add(new Square(n++, x, y));
		if (xmin > x) xmin = x;
		if (xmax < x) xmax = x;
		if (ymin > y) ymin = y;
		if (ymax < y) ymax = y;
	}

	public void add(int index, int position) {
		int x = 0, y = 0;
		switch (position) {
		case 0:
			x = -1;
			y = 0;
			break;
		case 1:
			x = 0;
			y = -1;
			break;
		case 2:
			x = 0;
			y = 1;
			break;
		case 3:
			x = 1;
			y = 0;
			break;
		default:
			return;
		}
		addByPoint(squares.get(index).getX() + x, squares.get(index).getY() + y);
	}

	public int getHeight() {
		return ymax - ymin + 1;
	}

	public int getWidth() {
		return xmax - xmin + 1;
	}
}

class Square {
	private int index, x, y;

	public Square(int index, int x, int y){
		this.index = index;
		this.x = x;
		this.y = y;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
}