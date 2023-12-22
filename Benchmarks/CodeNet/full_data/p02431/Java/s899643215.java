import java.util.Vector;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Vector <Integer> vector = new Vector<Integer>();
		try (Scanner sc = new Scanner (System.in)){
			int times = sc.nextInt();
			for (int i=0; i < times; i++) {
				int request = sc.nextInt();
				switch (request) {
				case 0:
					int x = sc.nextInt();
					vector.add(x);
					break;

				case 1:
					int p = sc.nextInt();
					System.out.println(vector.get(p));
					break;

				case 2:
					vector.remove(vector.size()-1);
					break;

				}
			}
		}
	}
}

