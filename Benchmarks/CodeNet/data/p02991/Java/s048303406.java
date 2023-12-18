import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numNode = sc.nextInt();
		int numEdge = sc.nextInt();
		int go[][] = new int[numNode][numNode];
		int max[] = new int[numNode];
		for(int i = 0; i < numEdge; i ++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			go[a][max[a]] = b;
			max[a] ++;
		}
		int start = sc.nextInt() - 1;
		int goal = sc.nextInt() - 1;

		long need[] = new long[numNode];
		for(int i = 0; i < numNode; i ++) {
			need[i] = -1;
		}

		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.addFirst(start);

		int count = 0;
		while (!stack.isEmpty()) {
			int size = stack.size();
			for(int a = 0; a < size; a ++) {
				int crt = stack.removeFirst();
				if(need[crt] >= 0 && count % 3 == 0) { continue; }
				if(count % 3 == 0) { need[crt] = count / 3; }
				for(int i = 0; i < max[crt]; i ++) {
					stack.addLast(go[crt][i]);
				}
			}
			if(need[goal] >= 0) { break; }
			count ++;
		}

		System.out.println(need[goal]);
	}
}