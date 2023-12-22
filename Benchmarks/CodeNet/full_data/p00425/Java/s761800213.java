import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			if (n == 0)
				break;
			Dice d = new Dice(1, 2, 3);
			for (int i = 0; i < n; i++)
				d.move(scan.next());
			System.out.println(d.getTotal());
		}

		scan.close();
		System.exit(0);
	}
}

class Dice {
	int u, f, r, total;

	public Dice(int Up, int Front, int Right) {
		u = Up;
		f = Front;
		r = Right;
		total = 0;
	}

	public int getTotal() {
		return total;
	}

	public void move(String oper) {
		int tmp;
		switch (oper) {
		case "North":
			tmp = 7 - u;
			u = f;
			f = tmp;
			break;
		case "East":
			tmp = 7 - r;
			r = u;
			u = tmp;
			break;
		case "South":
			tmp = 7 - f;
			f = u;
			u = tmp;
			break;
		case "West":
			tmp = 7 - u;
			u = r;
			r = tmp;
			break;
		case "Right":
			tmp = 7 - f;
			f = r;
			r = tmp;
			break;
		case "Left":
			tmp = 7 - r;
			r = f;
			f = tmp;
			break;
		}
		total += u;
	}

}