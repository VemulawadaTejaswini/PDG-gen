import java.util.EnumMap;
import java.util.Scanner;

public class Main {
	static final Node root = new Node();
	static {
		String[] zo = { "101", "000000", "000011", "10010001", "010001",
				"000001", "100101", "10011010", "0101", "0001", "110", "01001",
				"10011011", "010000", "0111", "10011000", "0110", "00100",
				"10011001", "10011110", "00101", "111", "10011111", "1000",
				"00110", "00111", "10011100", "10011101", "000010", "10010010",
				"10010011", "10010000" };
		char[] co = { ' ', '\'', ',', '-', '.', '?', 'A', 'B', 'C', 'D', 'E',
				'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
				'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		for (int i = 0; i < co.length; i++) {
			root.set(new Leaf(co[i]), zo[i].toCharArray(), 0);
		}
	}

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			char[] q = in.nextLine().toCharArray();
			if (q.length == 0) {
				break;
			}
			StringBuilder sb = new StringBuilder();
			for (char q0 : q) {
				int b = 0;
				switch (q0) {
				case '?':
					b = 31;
					break;
				case '\'':
					b = 30;
					break;
				case '-':
					b = 29;
					break;
				case ',':
					b = 28;
					break;
				case '.':
					b = 27;
					break;
				case ' ':
					b = 26;
					break;
				default:
					b = (q0 - 'A');
					break;
				}
				String bs = Integer.toBinaryString(b);
				for (int i = 0; i < 5 - bs.length(); i++) {
					sb.append('0');
				}
				sb.append(bs);
			}
			char[] zo = sb.toString().toCharArray();
			sb.setLength(0);
			int index = 0;
			while (index < zo.length) {
				index = root.write(zo, index, sb);
			}
			System.out.println(sb.toString());
		}
	}

}

enum Signal {
	_0, _1;
	static Signal of(char c) {
		return (c == '0') ? _0 : _1;
	}
}

interface Tree {

	int write(char[] s, int i, StringBuilder sb);

}

class Node implements Tree {
	EnumMap<Signal, Tree> node = new EnumMap<Signal, Tree>(Signal.class);

	Tree set(Leaf c, char[] s, int index) {
		Signal signal = Signal.of(s[index]);
		Tree child;
		if (index == s.length - 1) {
			child = c;
			node.put(signal, child);
		} else if (node.containsKey(signal)) {
			child = ((Node) node.get(signal)).set(c, s, index + 1);
			node.put(signal, child);
		} else {
			child = new Node().set(c, s, index + 1);
			node.put(signal, child);
		}

		return this;
	}

	public int write(char[] s, int start, StringBuilder sb) {
		if (s.length <= start) {
			return s.length;
		}
		return node.get(Signal.of(s[start])).write(s, start + 1, sb);
	}

}

class Leaf implements Tree {
	final char c;

	Leaf(char c) {
		this.c = c;
	}

	public int write(char[] s, int start, StringBuilder sb) {
		sb.append(c);
		return start;
	}
}