import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String s = in.readLine();
		String[] tokens = in.readLine().split(" ");
		int x = Integer.parseInt(tokens[0]);
		int y = Integer.parseInt(tokens[1]);
		Deque<Integer> vertical = new ArrayDeque<>();
		Deque<Integer> horizontal = new ArrayDeque<>();
		vertical.addLast(0);
		horizontal.addLast(0);

		boolean isHorizontal = true;
		for (int i = 0; i < s.length(); ++i) {
			if (s.charAt(i) == 'F') {
				if (isHorizontal) {
					int val = horizontal.pollLast();
					horizontal.addLast(val + 1);
				} else {
					int val = vertical.pollLast();
					vertical.addLast(val + 1);
				}
			} else {
				if (isHorizontal) {
					isHorizontal = false;
					vertical.addLast(0);
				} else {
					isHorizontal = true;
					horizontal.addLast(0);
				}
			}
		}

		List<Integer> horizontalMoves = new ArrayList<>();
		List<Integer> verticalMoves = new ArrayList<>();
		int initY = 0;
		int initX = horizontal.isEmpty() ? 0 : horizontal.pollFirst();
		horizontalMoves.addAll(horizontal);
		verticalMoves.addAll(vertical);
		Comparator<Integer> comp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -1 * Integer.compare(o1, o2);
			}
		};
		Collections.sort(horizontalMoves, comp);
		Collections.sort(verticalMoves, comp);
		boolean movableHorizontal = isMovable(horizontalMoves, x - initX);
		boolean movableVertical = isMovable(verticalMoves, y - initY);
		if (movableHorizontal && movableVertical) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static boolean isMovable(List<Integer> moves, int dist) {
		int current = 0;
		for (int i = 0; i < moves.size(); ++i) {
			Integer move = moves.get(i);
			if (current < dist) {
				current += move;
			} else {
				current -= move;
			}
		}
		if (dist == current) {
			return true;
		} else {
			return false;
		}
	}
}