import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 0282 Programming Contest
 */
public class Main {

	public static void main(String[] args) throws IOException {

		// Read contest basic info
		Contest contest = readContest();

		// Read record and count up time
		contest.start();

		// Show result
		System.out.println(contest.getWinner());
	}

	// Read contest basic info
	private static Contest readContest() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] splitted = reader.readLine().split(" ");
		int[] converted = convertStringToInt(splitted);
		return new Contest(converted[0], converted[1], converted[2], reader);
	}

	// Convert string array to int array
	private static int[] convertStringToInt(String[] str) {
		int[] converted = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			converted[i] = Integer.parseInt(str[i]);
		}
		return converted;
	}

	// Get max score team
	private static int getMaxScoreTeam(long[] target) {
		int index = 1;
		long max = target[1];
		for (int i = 2; i < target.length; i++) {
			if (max < target[i]) {
				max = target[i];
				index = i;
			}
		}
		return index;
	}

	// Get max show time team
	private static int getMaxShowTimeTeam(int[] target) {
		int index = 1;
		long max = target[1];
		for (int i = 2; i < target.length; i++) {
			if (max < target[i]) {
				max = target[i];
				index = i;
			}
		}
		return index;
	}

	// Contest
	private static class Contest {
		private static final int TEAM_NO = 0;
		private static final int TIME = 1;
		private static final int SCORE = 2;

		private int teamNo;
		private int recordNo;
		private int endTime;
		private BufferedReader reader;
		private int winner;

		// Constructor
		public Contest(int teamNo, int recordNo, int time, BufferedReader reader) {
			this.teamNo = teamNo;
			this.recordNo = recordNo;
			this.endTime = time;
			this.reader = reader;
		}

		// Start contest
		public void start() throws IOException {
			int timer = 0;
			int currentTeam = 1;
			long[] teamScoreMap = new long[teamNo + 1];
			int[] teamShowTimeMap = new int[teamNo + 1];

			// FIXME: ???????????????????????????????????????????????§???????????§???????????????????????????
			int previousMaxTeam = 1;
			long previousMaxScore = 0;
			for (int i = 0; i < recordNo; i++) {
				int[] record = convertStringToInt(reader.readLine().split(" "));

				// Reduce high cost process, for test case #7
				if (record[TIME] != timer) {
					// Select show team
					// currentTeam = getMaxScoreTeam(teamScoreMap);
					currentTeam = previousMaxTeam;

					// Add show time
					int showTime = record[TIME] - timer;
					teamShowTimeMap[currentTeam] += showTime;

					// Update currentTime
					timer = record[TIME];
				}

				// Update score
				teamScoreMap[record[TEAM_NO]] += record[SCORE];
				// Update max score
				if (previousMaxScore < teamScoreMap[record[TEAM_NO]]) {
					previousMaxScore = teamScoreMap[record[TEAM_NO]];
					previousMaxTeam = record[TEAM_NO];
				} else if(previousMaxTeam == record[TEAM_NO] && record[SCORE] < 0) {
					previousMaxTeam = getMaxScoreTeam(teamScoreMap);
					previousMaxScore = teamScoreMap[previousMaxTeam];
				}

				// Debug
				/*
				System.out.println("Record: " + i);
				System.out.println("previousMaxScore: " + previousMaxScore + ", previousMaxTeam: " + previousMaxTeam);
				System.out.print("teamScore: ");
				Arrays.stream(teamScoreMap).forEach(score -> System.out.print(score + ", "));;
				System.out.println();
				System.out.print("teamShowTime: ");
				Arrays.stream(teamShowTimeMap).forEach(t -> System.out.print(t + ", "));;
				System.out.println();
				System.out.println();
				*/
			}

			// Finally add show time to end of contest
			if (endTime != timer) {
				// currentTeam = getMaxScoreTeam(teamScoreMap);
				currentTeam = previousMaxTeam;
				int showTime = endTime - timer;
				teamShowTimeMap[currentTeam] += showTime;
			}

			// Debug
			/*
			System.out.println("Finish.");
			System.out.print("teamScore: ");
			System.out.println("previousMaxScore: " + previousMaxScore + ", previousMaxTeam: " + previousMaxTeam);
			Arrays.stream(teamScoreMap).forEach(score -> System.out.print(score + ", "));;
			System.out.println();
			System.out.print("teamShowTime: ");
			Arrays.stream(teamShowTimeMap).forEach(t -> System.out.print(t + ", "));;
			System.out.println();
			System.out.println();
			*/

			// Decide winner
			winner = getMaxShowTimeTeam(teamShowTimeMap);
		}

		// Get winner
		public int getWinner() {
			return winner;
		}
	}

}