import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = in.nextInt(), loop = in.nextInt();

		ArrayList<ArrayList<Integer>> vector2 = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i < n; i++) {
			ArrayList<Integer> arr = new ArrayList<>();
			vector2.add(arr);
		}

		for(int i = 0; i < loop; i++) {
			int odr = Integer.parseInt(in.next()), index = Integer.parseInt(in.next());

			switch(odr) {
				case 0:
					vector2.get(index).add(Integer.parseInt(in.next()));
					break;

				case 1:
					int length = vector2.get(index).size();
					for(int j = 0; j < length; j++) {
						out.printf("%d%s", vector2.get(index).get(j), (j < length - 1) ? " " : "");
					}
					out.println();
					break;

				case 2:
					vector2.get(index).clear();
					break;
			}
		}
		out.flush();
		in.close();
	}

}

