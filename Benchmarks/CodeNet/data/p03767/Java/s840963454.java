import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			// input
			List<Long> integers = new ArrayList<Long>();
			for (int i = 0; i < 3 * N; i++) {
				integers.add(scanner.nextLong());
			}
			//参加者配列を降順ソート
			Collections.sort(integers, Comparator.reverseOrder());
			// 参加者振り分け処理
			List<List<Long>> teams = allocateTerm(integers, N);
			// チームごと2番目の合計値を算出する
			System.out.println(secondSankaSum(teams));
		}
	}

	private static long secondSankaSum(List<List<Long>> teams) {
		long sum = 0;
		for (Iterator<List<Long>> iterator = teams.iterator(); iterator.hasNext();) {
			List<Long> list = (List<Long>) iterator.next();
			sum += list.get(1);
		}
		return sum;
	}

	private static List<List<Long>> allocateTerm(List<Long> integers, int sankaTeamCnt) {
		List<List<Long>> teams = initTeams(sankaTeamCnt);
		for (int i = 0; i < integers.size(); i += sankaTeamCnt) {
			for (int j = i; j < i + sankaTeamCnt; j++) {
				teams.get(j % sankaTeamCnt).add(integers.get(j));
			}
		}
		return teams;
	}

	private static List<List<Long>> initTeams(int sankaTeamCnt) {
		// TODO 自動生成されたメソッド・スタブ
		List<List<Long>> teams = new ArrayList<List<Long>>();
		for (int i = 0; i < sankaTeamCnt; i++) {
			teams.add(new ArrayList<Long>());
		}
		return teams;
	}
}