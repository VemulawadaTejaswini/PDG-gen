import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		int w, n;
		w = n = 0;

		Main main = new Main();
		ArrayList<Lane> lanes = new ArrayList<Main.Lane>();
		ArrayList<Rule> rules = new ArrayList<Main.Rule>();

		try {
			w = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());

			for (int i = 1; i <= w; i++) {
				lanes.add(main.new Lane(i));
			}

			while ((s = br.readLine()) != null) {
				rules.add(main.new Rule(s));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (Lane l : lanes) {
			for (Rule r : rules) {
				l.applyRule(r);
			}
		}
		for (int i = 1; i <= w; i++) {
			for (Lane l : lanes) {
				if (l.getCurrentLane() == i)
					System.out.println(l.getInitialLane());
			}
		}
	}

	class Lane {
		private int initial;
		private int current;

		Lane(int lane) {
			this.initial = this.current = lane;
		}

		int getInitialLane() {
			return initial;
		}

		int getCurrentLane() {
			return current;
		}

		void applyRule(Rule rule) {
			current = rule.getNewLane(current);
		}
	}

	class Rule {
		private ArrayList<Integer> pair = new ArrayList<Integer>();

		Rule(int a, int b) {
			pair.add(a);
			pair.add(b);
		}

		Rule(String s) {
			int a = Integer.parseInt((s.split(",")[0]));
			int b = Integer.parseInt((s.split(",")[1]));
			pair.add(a);
			pair.add(b);
		}

		int getNewLane(int lane) {
			if (pair.contains(lane)) {
				return (lane == pair.get(0) ? pair.get(1) : pair.get(0));
			} else {
				return lane;
			}

		}
	}
}