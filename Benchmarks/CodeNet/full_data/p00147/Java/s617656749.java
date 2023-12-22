
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	private static final int MAX_GROUP_COUNT = 100;
	private int time = 0;
	private int groupCount = 0;

	public static void main(String[] args) throws Exception {
		new Main().execute();
	}

	private void execute() throws Exception {

		// 標準入力を１行ずつ処理
		List<Integer> targetGroups = readInitialData();

		EatingPerson[] seats = new EatingPerson[17];
		List<WaitingPerson> waitingGroups = new ArrayList<WaitingPerson>();
		List<Integer> waitTimes = new ArrayList<Integer>();
		
		// 待ち時間を調べる必要がある最後のグループを取得
		int maxGroupNum = searchMaxGroupNum(targetGroups);

		while (groupCount < maxGroupNum) {

			// 行列の更新
			updateWaitLine(waitingGroups);

			// 離席する
			leaveSeat(seats);

			// 着席する
			sitDown(seats, waitingGroups, waitTimes);

			time++;
		}

		for (int targetGroup : targetGroups) {
			System.out.println(waitTimes.get(targetGroup));
		}
	}

	private int searchMaxGroupNum(List<Integer> targetGroups) {
		// 最大番号のグループ
		int maxGroupNum = 0;
		for (int targetGroup : targetGroups) {
			if (maxGroupNum < targetGroup) {
				maxGroupNum = targetGroup;
			}
		}
		return maxGroupNum;
	}

	private void sitDown(EatingPerson[] seats,
			List<WaitingPerson> waitingGroups, List<Integer> waitTimes) {

		int removeCount = 0;
		for (WaitingPerson waitingPerson : waitingGroups) {

			int emptySeatCount = 0;
			boolean isEmpty = false;
			for (int i = 0; i < seats.length; i++) {

				// 空席数を検知
				if (seats[i] == null) {
					emptySeatCount++;
				} else {
					emptySeatCount = 0;
				}

				if (waitingPerson.getNumber() == emptySeatCount) {

					// 席に座ったグループ数を更新
					groupCount++;
					removeCount++;
					isEmpty = true;

					// 所属グループの待ち時間を記録
					waitTimes.add(time - waitingPerson.getStartTime());

					// 食べ終わる時間を計算
					int endTime = 17 * (waitingPerson.getGroup() % 2) + 3
							* (waitingPerson.getGroup() % 3) + 19;

					for (int j = 0; j < emptySeatCount; j++) {
						seats[i - j] = new EatingPerson(
								waitingPerson.getGroup(), endTime + time);
					}
					break;
				}
			}

			if (!isEmpty) {
				break;
			}

		}

		for (int i = 0; i < removeCount; i++) {
			waitingGroups.remove(0);
		}
	}

	private void leaveSeat(EatingPerson[] seats) {
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] != null && seats[i].getEndTime() == time) {
				seats[i] = null;
			}
		}
	}

	private void updateWaitLine(List<WaitingPerson> waitingGroups) {
		int nowGroup = time / 5;

		// グループがやってきたか判定
		if (time % 5 == 0) {
			// グループの人数を算出
			int number = 2;
			if (nowGroup % 5 == 1) {
				number = 5;
			}

			// 行列の後ろに追加
			// 待ち始めた時間を記録
			waitingGroups.add(new WaitingPerson(nowGroup, number, time));
		}
	}

	private List<Integer> readInitialData() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String line = null;
		List<Integer> groups = new ArrayList<Integer>();
		while ((line = reader.readLine()) != null) {
			groups.add(Integer.parseInt(line));
		}

		return groups;
	}

}

abstract class Person {

	// 所属グループ
	private int group;

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

}

class WaitingPerson extends Person {

	public WaitingPerson(int group, int number, int startTime) {
		setGroup(group);
		setNumber(number);
		setStartTime(startTime);
	}

	// 待ち始めた時刻
	private int startTime;

	// グループの人数
	private int number;

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

class EatingPerson extends Person {

	public EatingPerson(int group, int endTime) {
		setGroup(group);
		setEndtTime(endTime);
	}

	// 食べ終わる時間
	private int endtTime;

	public int getEndTime() {
		return endtTime;
	}

	public void setEndtTime(int endtTime) {
		this.endtTime = endtTime;
	}

}