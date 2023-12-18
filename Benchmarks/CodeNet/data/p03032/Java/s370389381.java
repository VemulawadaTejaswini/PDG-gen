import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		ArrayList<Integer> v = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			v.add(scanner.nextInt());
		}
		
		Queue<State> queue = new LinkedList<>();
		queue.add(new State((ArrayList) v.clone(), new ArrayList<>(), k));
		int max = 0;
		while (queue.size() > 0) {
			State current = queue.poll();
			if (current.getK() == 0) {
				max = Math.max(max, current.getSum());
			}
			// 左から取り出す
			State next1 = current.popLeft();
			if (next1 != null) {
				queue.add(next1);
			}
			State next2 = current.popRight();
			if (next2 != null) {
				queue.add(next2);
			}
			queue.addAll(current.pushLeft());
			queue.addAll(current.pushRight());
		}
		System.out.println(max);
	}
	
	private static class State {
		private ArrayList<Integer> v;
		private ArrayList<Integer> temochi;
		int k;
		public State(ArrayList<Integer> v, ArrayList<Integer> temochi, int k) {
			this.v = v;
			this.temochi = temochi;
			this.k = k;
		}
		
		public List<Integer> getTemochi() {
			return temochi;
		}
		
		public List<Integer> getV() {
			return v;
		}
		
		public int getK() {
			return k;
		}
		
		public State popLeft() {
			return pop(0);
		}
		
		public State popRight() {
			return pop(v.size() - 1);
		}
		
		public List<State> pushLeft() {
			List<State> states = new ArrayList<State>();
			for (int i = 0; i < temochi.size(); i++) {
				State state = push(true, i);
				if (state != null) {
					states.add(state);
				}
			}
			return states;
		}
		public List<State> pushRight() {
			List<State> states = new ArrayList<State>();
			for (int i = 0; i < temochi.size(); i++) {
				State state = push(false, i);
				if (state != null) {
					states.add(state);
				}
			}
			return states;
		}
		
		private State pop(int position) {
			if (v.isEmpty() || k == 0) {
				return null;
			}
			ArrayList<Integer> cv = (ArrayList<Integer>) v.clone();
			ArrayList<Integer> ctemochi = (ArrayList<Integer>) temochi.clone();
			ctemochi.add(cv.remove(position));
			return new State(cv, ctemochi, k - 1);
		}
		private State push(boolean isLeft, int popposition) {
			if (temochi.isEmpty() || k == 0) {
				return null;
			}
			ArrayList<Integer> cv = (ArrayList<Integer>) v.clone();
			ArrayList<Integer> ctemochi = (ArrayList<Integer>) temochi.clone();
			if (isLeft) {
				cv.add(0, ctemochi.remove(popposition));
			} else {
				cv.add(ctemochi.remove(popposition));
			}
			return new State(cv, ctemochi, k - 1);
		}
		
		public int getSum() {
			int sum = 0;
			for (Integer i : temochi) {
				sum = sum + i;
			}
			return sum;
		}
	}
}
