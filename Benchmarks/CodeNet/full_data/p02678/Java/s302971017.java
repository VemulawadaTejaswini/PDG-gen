import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Room {
	int number, cost;

	Room(int number, int cost) {
		this.number = number;
		this.cost = cost;
	}
}

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Supplier<String> sc) {
		int N = Integer.parseInt(sc.get());
		int M = Integer.parseInt(sc.get());
		var rawRooms = new IntStream.Builder[N];
		Arrays.setAll(rawRooms, $ -> IntStream.builder());
		for (int i = 0; i < M; i++) {
			int A = Integer.parseInt(sc.get())-1;
			int B = Integer.parseInt(sc.get())-1;
			rawRooms[A].add(B);
			rawRooms[B].add(A);
		}

		var rooms = new int[N][];
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = rawRooms[i].build().toArray();
		}


		int[] result = new int[N];
		Arrays.fill(result, -1);

		var deque = new PriorityQueue<Room>(Comparator.comparingInt(r -> r.cost));
		deque.add(new Room(0, 0));
		while (!deque.isEmpty()) {
			Room room = deque.remove();
			int index = room.number;
			int cost = room.cost;
			for (int next : rooms[index]) {
				if (result[next] == -1) {
					result[next] = index;
					var nextRoom = new Room(next, cost + 1);
					deque.add(nextRoom);
				}
			}
		}

		System.out.println("Yes");
		var joiner = new StringJoiner("\n");
		for (int i = 1; i < result.length; i++) {
			joiner.add(String.valueOf(result[i] + 1));
		}
		System.out.println(joiner);
	}
}

class Main {
	public static void main(String... args) {
		var reader = new BufferedReader(new InputStreamReader(System.in));
		Solver.INSTANCE.solve(new Supplier<>() {
			StringTokenizer line;

			public String get() {
				while (line == null || !line.hasMoreTokens()) try {
					line = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new UncheckedIOException(e);
				}
				return line.nextToken();
			}
		});
	}
}