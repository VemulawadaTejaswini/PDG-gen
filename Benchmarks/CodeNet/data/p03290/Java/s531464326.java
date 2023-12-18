import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] conf = scanner.nextLine().split(" ");
		int numPoints = Integer.parseInt(conf[0]);
		long goal = Long.parseLong(conf[1]);
		int[] numProblems = new int[numPoints + 1];
		long[] achievablePoints = new long[numPoints + 1];
		boolean[] hasUsed = new boolean[numPoints + 1];

		for(int pIdx = 1; pIdx <= numPoints; pIdx++) {
			String[] inputs = scanner.nextLine().split(" ");
			numProblems[pIdx] = Integer.parseInt(inputs[0]);
			achievablePoints[pIdx] = numProblems[pIdx] * pIdx * 100 + Integer.parseInt(inputs[1]);
			hasUsed[pIdx] = false;
		}

		long totalPoint = 0L;
		int minNumProblem = 0;
		while(totalPoint < goal) {
			double maxPPP = 0d;
			int pIdxOfMaxPPP = 0;
			for(int pIdx = 1; pIdx <= numPoints; pIdx++) {
				double tmpPPP = hasUsed[pIdx] ? 0L : achievablePoints[pIdx] / (double)numProblems[pIdx];
				if(tmpPPP > maxPPP) {
					pIdxOfMaxPPP = pIdx;
					maxPPP = tmpPPP;
				}
			}
			if(totalPoint + achievablePoints[pIdxOfMaxPPP] <= goal) {
				totalPoint += achievablePoints[pIdxOfMaxPPP];
				minNumProblem += numProblems[pIdxOfMaxPPP];
				hasUsed[pIdxOfMaxPPP] = true;
			} else break;
		}

		long remainder = goal - totalPoint;
		if(remainder > 0L) {
			int tmpMinNumProblem = Integer.MAX_VALUE;
			for(int pIdx = 1; pIdx <= numPoints; pIdx++) {
				int tmpNumProblem;
				if(!hasUsed[pIdx] && achievablePoints[pIdx] >= remainder) {
					if(numProblems[pIdx] * pIdx * 100 >= remainder) tmpNumProblem = (int) ((remainder - 1) / (pIdx * 100)) + 1;
					else tmpNumProblem = numProblems[pIdx];
					if(tmpNumProblem < tmpMinNumProblem) tmpMinNumProblem = tmpNumProblem;
				}
			}
			minNumProblem += tmpMinNumProblem;
		}

		System.out.println(minNumProblem);
	}
}
