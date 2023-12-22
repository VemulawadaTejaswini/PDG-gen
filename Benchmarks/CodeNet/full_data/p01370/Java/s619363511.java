import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static final Integer BLOCK = Integer.valueOf(31);
	static Map<Hex, Integer> move = new HashMap<Hex, Integer>();

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int t = in.nextInt();
			int n = in.nextInt();
			if (t == 0 && n == 0) {
				break;
			}
			move.clear();
			for (int i = 0; i < n; i++) {
				move.put(new Hex(in.nextInt(), in.nextInt()), BLOCK);
			}
			setMoved(new Hex(in.nextInt(), in.nextInt()), t);
			System.out.println(move.size() - n);
		}
		in.close();
	}

	static void setMoved(Hex hex, int t) {
		Integer thisT = Integer.valueOf(t);
		if (!move.containsKey(hex)) {
			move.put(hex, t);
		} else {
			if (move.get(hex).compareTo(thisT) < 0) {
				move.put(hex, thisT);
			}
		}
		if (t-- > 0) {
			// System.out.println(hex.x + ":" + hex.y + "=>" + t);
			int x = hex.x;
			int y = hex.y;
			Hex[] hexs = new Hex[] { new Hex(x + 1, y + 1), new Hex(x + 1, y),
					new Hex(x, y - 1), new Hex(x - 1, y - 1),
					new Hex(x - 1, y), new Hex(x, y + 1), };
			for (Hex tonari : hexs) {
				if (!move.containsKey(tonari)
						|| move.get(tonari).intValue() < t) {
					setMoved(tonari, t);
				}
			}
		}
	}
}

class Hex {
	public final int x, y;

	public Hex(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Hex other = (Hex) obj;
		if (x != other.x) {
			return false;
		}
		if (y != other.y) {
			return false;
		}
		return true;
	}
}