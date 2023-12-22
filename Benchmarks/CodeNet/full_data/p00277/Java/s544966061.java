import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Programming Contest
 * PCK2013
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			StringTokenizer st = new StringTokenizer(line);

			int N, R, L;
			N = parseInt(st.nextToken());
			R = parseInt(st.nextToken());
			L = parseInt(st.nextToken());

			Team[] team = new Team[N + 1];

			Queue<Team> pq = new PriorityQueue<>((x, y) -> {
				if (x.point == y.point) {
					return Integer.compare(x.id, y.id);
				} else {
					return Integer.compare(y.point, x.point);
				}
			});

			for (int i = 1; i <= N; i++) {
				team[i] = new Team(i);
			}

			int elapsed = 0;
			pq.offer(team[1]);

			for (int i = 0; i < R; i++) {
				st = new StringTokenizer(br.readLine());
				int d, t, x;
				d = parseInt(st.nextToken());
				t = parseInt(st.nextToken());
				x = parseInt(st.nextToken());
				pq.peek().time += t - elapsed;
				//
				pq.remove(team[d]);
				team[d].point += x;
				pq.offer(team[d]);
				//
				if (pq.size() > 5) {
					List<Team> list = new ArrayList<>();
					for (int j = 0; j < 5; j++) {
						list.add(pq.poll());
					}
					pq.clear();
					pq.addAll(list);
				}
				//
				elapsed = t;
			}

			pq.peek().time += L - elapsed;

			//
			pq = new PriorityQueue<>((x, y) -> {
				if (x.time == y.time) {
					return Integer.compare(x.id, y.id);
				} else {
					return Integer.compare(y.time, x.time);
				}
			});

			for (int i = 1; i <= N; i++) {
				pq.offer(team[i]);
			}

			System.out.println(pq.peek().id);
		}
	}
}

class Team {

	int id, time = 0, point = 0;

	Team(int id) {
		this.id = id;
	}
}