import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		ArrayList<ArrayDeque<Integer>> que = new ArrayList<ArrayDeque<Integer>>();

		int n = in.nextInt(), loop = in.nextInt();
		for(int i = 0; i < n ; i++) {
			ArrayDeque<Integer> q = new ArrayDeque<>();
			que.add(q);
		}

		for(int i = 0; i < loop; i++) {
			int odr = Integer.parseInt(in.next()), index = Integer.parseInt(in.next());

			switch(odr) {
				case 0:
					que.get(index).add(Integer.parseInt(in.next()));
					break;

				case 1:
					if(!que.get(index).isEmpty()) {
						out.println(que.get(index).peek());
					}
					break;

				case 2:
					if(!que.get(index).isEmpty()) {
						que.get(index).remove();
					}
					break;
			}
		}
		out.flush();
		in.close();

	}

}



