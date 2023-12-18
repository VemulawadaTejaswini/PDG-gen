
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Scanner nLine = new Scanner(reader.nextLine());
		int n = nLine.nextInt();
		int m = nLine.nextInt();
		ArrayList<Integer> unique = new ArrayList<Integer>();
		int count = 0;


		while (reader.hasNextLine()) {
			count++;
			Scanner line = new Scanner(reader.nextLine());
			ArrayList<Integer> list = new ArrayList<Integer>();
			int base = line.nextInt();
			while (line.hasNextInt()) {
				int i = line.nextInt();
				if (i <= m) {
					list.add(i);
					if (count == 1) {
						unique.add(i);
					}
				}
			}
			for(int j = 0; j < unique.size(); j++) {
				if (!list.contains(unique.get(j))) {
					unique.remove(j);
				}
			}
		}

		if (count == n) {
			System.out.print(unique.size());
		} else {
			System.out.print(0);
		}




	}


}
