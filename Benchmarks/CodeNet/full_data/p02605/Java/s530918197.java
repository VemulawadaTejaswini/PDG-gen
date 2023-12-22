import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var jets = new ArrayList<Jet>();
		for (var i = 0; i < n; i++) {
			jets.add(new Main().new Jet(sc.nextInt(), sc.nextInt(), sc.next()));
		}
		sc.close();

		var value = Integer.MAX_VALUE;
		var jets1 = jets.stream().filter(jet -> jet.getU().equals("U") || jet.getU().equals("D")).collect(Collectors.toList());
		Collections.sort(jets1, new Main().new ComparatorX());
		for (var i = 0; i < jets1.size() - 1; i++) {
			var jet1 = jets1.get(i);
			var jet2 = jets1.get(i + 1);
			if (jet1.getX() == jet2.getX() && jet1.getU().equals("U") && jet2.getU().equals("D")) {
				value = Math.min(value, (jet2.getY() - jet1.getY()) * 5);
			}
		}

		var jets2 = jets.stream().filter(jet -> jet.getU().equals("R") || jet.getU().equals("L")).collect(Collectors.toList());
		Collections.sort(jets2, new Main().new ComparatorY());
		for (var i = 0; i < jets2.size() - 1; i++) {
			var jet1 = jets2.get(i);
			var jet2 = jets2.get(i + 1);
			if (jet1.getY() == jet2.getY() && jet1.getU().equals("R") && jet2.getU().equals("L")) {
				value = Math.min(value, (jet2.getX() - jet1.getX()) * 5);
			}
		}

		var jets3 = jets.stream().filter(jet -> jet.getU().equals("R") || jet.getU().equals("U")).collect(Collectors.toList());
		Collections.sort(jets3, new Main().new ComparatorV());
		for (var i = 0; i < jets3.size() - 1; i++) {
			var jet1 = jets3.get(i);
			var jet2 = jets3.get(i + 1);
			if (jet1.getV() == jet2.getV() && jet1.getU().equals("R") && jet2.getU().equals("U")) {
				value = Math.min(value, (jet2.getX() - jet1.getX()) * 10);
			}
		}

		var jets4 = jets.stream().filter(jet -> jet.getU().equals("L") || jet.getU().equals("D")).collect(Collectors.toList());
		Collections.sort(jets4, new Main().new ComparatorV());
		for (var i = 0; i < jets4.size() - 1; i++) {
			var jet1 = jets4.get(i);
			var jet2 = jets4.get(i + 1);
			if (jet1.getV() == jet2.getV() && jet1.getU().equals("D") && jet2.getU().equals("L")) {
				value = Math.min(value, (jet2.getX() - jet1.getX()) * 10);
			}
		}

		var jets5 = jets.stream().filter(jet -> jet.getU().equals("R") || jet.getU().equals("D")).collect(Collectors.toList());
		Collections.sort(jets5, new Main().new ComparatorW());
		for (var i = 0; i < jets5.size() - 1; i++) {
			var jet1 = jets5.get(i);
			var jet2 = jets5.get(i + 1);
			if (jet1.getW() == jet2.getW() && jet1.getU().equals("R") && jet2.getU().equals("D")) {
				value = Math.min(value, (jet2.getX() - jet1.getX()) * 10);
			}
		}

		var jets6 = jets.stream().filter(jet -> jet.getU().equals("L") || jet.getU().equals("U")).collect(Collectors.toList());
		Collections.sort(jets6, new Main().new ComparatorW());
		for (var i = 0; i < jets6.size() - 1; i++) {
			var jet1 = jets6.get(i);
			var jet2 = jets6.get(i + 1);
			if (jet1.getW() == jet2.getW() && jet1.getU().equals("U") && jet2.getU().equals("L")) {
				value = Math.min(value, (jet2.getX() - jet1.getX()) * 10);
			}
		}

		System.out.println(value == Integer.MAX_VALUE ? "SAFE" : value);
	}

	public class ComparatorX implements Comparator<Jet>{
		@Override
		public int compare(Jet jet1, Jet jet2) {
			var result = jet1.getX() - jet2.getX();
			if (result != 0) {
				return result;
			}

			return jet1.getY() - jet2.getY();
		}
	}

	public class ComparatorY implements Comparator<Jet>{
		@Override
		public int compare(Jet jet1, Jet jet2) {
			var result = jet1.getY() - jet2.getY();
			if (result != 0) {
				return result;
			}

			return jet1.getX() - jet2.getX();
		}
	}

	public class ComparatorV implements Comparator<Jet>{
		@Override
		public int compare(Jet jet1, Jet jet2) {
			var result = jet1.getV() - jet2.getV();
			if (result != 0) {
				return result;
			}

			return jet1.getX() - jet2.getX();
		}
	}

	public class ComparatorW implements Comparator<Jet>{
		@Override
		public int compare(Jet jet1, Jet jet2) {
			var result = jet1.getW() - jet2.getW();
			if (result != 0) {
				return result;
			}

			return jet1.getX() - jet2.getX();
		}
	}

	public class Jet {
		private int x;
		private int y;
		private String u;
		private int v;
		private int w;

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public String getU() {
			return u;
		}

		public int getV() {
			return v;
		}

		public int getW() {
			return w;
		}

		public Jet(int x, int y, String u) {
			this.x = x;
			this.y = y;
			this.u = u;
			this.v = x + y;
			this.w = x - y;
		}
	}
}
