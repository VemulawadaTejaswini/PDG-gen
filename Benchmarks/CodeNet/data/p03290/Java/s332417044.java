import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static class ProbSet {
		int eachScore;
		int num;
		int bonus;
		int total;

		public ProbSet(int eachScore, int num, int bonus) {
			this.eachScore = eachScore;
			this.num = num;
			this.bonus = bonus;
			this.total = eachScore * num + bonus;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split(" ");
		int D = Integer.parseInt(tokens[0]);
		int G = Integer.parseInt(tokens[1]);
		int[] p = new int[D];
		int[] c = new int[D];
		for (int i = 0; i < D; ++i) {
			tokens = in.nextLine().split(" ");
			p[i] = Integer.parseInt(tokens[0]);
			c[i] = Integer.parseInt(tokens[1]);
		}
		Comparator<ProbSet> aveBaseComp = new Comparator<ProbSet>() {
			@Override
			public int compare(ProbSet o1, ProbSet o2) {
				double o1Ave = (double)o1.total / (double)o1.num;
				double o2Ave = (double)o2.total / (double)o2.num;
				if (o1Ave < o2Ave) {
					return 1;
				} else if (o1Ave > o2Ave) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		Comparator<ProbSet> eachBaseComp = new Comparator<ProbSet>() {
			@Override
			public int compare(ProbSet o1, ProbSet o2) {
				if (o1.eachScore < o2.eachScore) {
					return 1;
				} else if (o1.eachScore > o2.eachScore) {
					return -1;
				} else {
					return 0;
				}
			}
		};

		List<ProbSet> probSets = new ArrayList<>();
		for (int i = 0; i < D; ++i) {
			int score = (i + 1) * 100;
			probSets.add(new ProbSet(score, p[i], c[i]));
		}
		Collections.sort(probSets, aveBaseComp);
		int solvedNum = 0;
		while (true) {
			ProbSet probSet = probSets.get(0);
			// System.out.println("G= " + G);
			if (G > probSet.total) {
				G -= probSet.total;
				solvedNum += probSet.num;
				probSets.remove(0);
			} else {
				int minNum = Integer.MAX_VALUE;
				for (int i = 0; i < probSets.size(); ++i) {
					ProbSet set= probSets.get(i);
					// int n = Math.min(set.num, Math.floorDiv(G, set.eachScore));
					int n = Math.floorDiv(G,  set.eachScore);
					if (minNum > n) {
						minNum = n;
					}
				}
				solvedNum += minNum;
				break;
			}
		}
		System.out.println(solvedNum);
		in.close();
	}
}