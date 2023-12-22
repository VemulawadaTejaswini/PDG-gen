import java.io.IOException;
import java.util.*;

class Main {
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);

		Stack<Integer> st = new Stack<>();
		int ch;
		int sum = 0;
		List<Integer> lakes = new ArrayList<>();
		Stack<Pair<Integer, Integer>> lakeStack = new Stack<>(); // first: left's \ pos, right: the lake's size
		for(int i=0; (ch = System.in.read()) != -1; i++) {
			if (ch == '\n' || ch == '\r') {
				break;
			}

			if(ch == '\\') {
				st.push(i);
			} else if(ch == '/') {
				if(st.empty() == true) {
					continue;
				}
				int top = st.pop();
				sum += i - top;

				int lakePoint = i - top;

				while(lakeStack.empty() == false) {
					Pair<Integer, Integer> p = lakeStack.pop();
					if(p.fst >= top) {
						lakePoint += p.snd;
					} else {
						lakeStack.push(p);
						break;
					}
				}
				lakeStack.push(new Pair<>(top, lakePoint));
			}
		}

		while(lakeStack.empty() == false) {
			Pair<Integer, Integer> p = lakeStack.pop();
			lakes.add(p.fst);
		}
		Collections.reverse(lakes);

		System.out.println(sum);
		System.out.print(lakes.size()+ " ");
		for(int i=0;i<lakes.size();i++) {
			System.out.print(lakes.get(i) + " ");
		}
		System.out.println("");
	}
}

class Pair<TK,TV> {
	public TK fst;
	public TV snd;
	public Pair(TK fst, TV snd) {
		this.fst = fst;
		this.snd = snd;
	}
}