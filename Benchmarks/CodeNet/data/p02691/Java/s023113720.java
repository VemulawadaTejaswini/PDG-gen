import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		List<Agent> agentList = new ArrayList<>();

		for (int i = 1; i < n + 1; i++) {

			Agent agent = new Agent();
			agent.number = i;
			agent.height = scan.nextLong();

			agentList.add(agent);
		}

		Collections.sort(agentList);

		long count = 0;

		for (int i = 0; i < n - 1; i++) {
			

			Agent agentA = agentList.get(i);

			int maxAbs = 200000;

			for (int j = i + 1; j < n; j++) {

				Agent agentB = agentList.get(j);

				long sumHeight = agentA.height + agentB.height;

				if (maxAbs < sumHeight) {
					break;
				}

				long absNumber = Math.abs(agentA.number - agentB.number);

				if (absNumber == sumHeight) {
					count++;
				}
			}
		}

		println(count);
	}

	public static class Agent implements Comparable {

		public int number;
		public long height;

		public int compareTo(Object o) {
			Agent a = (Agent) o;

			if (this.height < a.height) {
				return -1;
			}
			if (this.height > a.height) {
				return 1;
			}
			return 0;
		}
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
