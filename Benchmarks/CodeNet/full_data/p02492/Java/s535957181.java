import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private class Line {

		public long a;
		public long b;
		public char op;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Line> list = new LinkedList<Line>();
		while (sc.hasNext()) {
			Line line = new Line();
			line.a = sc.nextLong();
			line.op = sc.next().charAt(0);
			line.b = sc.nextLong();
			list.add(line);
		}
		for (Line line : list) {
			switch (line.op) {
				case '+':
					System.out.println(line.a + line.b);
				case '-':
					System.out.println(line.a - line.b);
				case '*':
					System.out.println(line.a * line.b);
				case '/':
					System.out.println(line.a / line.b);
			}
		}
	}
}