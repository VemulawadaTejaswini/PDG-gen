
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	/** ??§?????° */
	private final static int SEATS = 17;

	/** ??¢??°???????????° */
	private final static int GROUP = 100;

	/** ??¢??°??????????????°???????????????????????? */
	private final static int INTERVAL = 5;

	/** ??¢??°???????????????????????????????´????????????? */
	private static int[] watingTimes = new int[GROUP];

	/** ??¢??°??????????????°?????????????????°????£?????????????????´???????????¬?????????? */
	private static int[][] groupInfo = new int[GROUP][3];

	/** ??¢??°??????????????°??????????????¨???????????? */
	private final static int GROUP_INFO_ARRIVAL = 0;

	/** ??¢??°?????????????????°?????¨???????????? */
	private final static int GROUP_INFO_PERSONS = 1;

	/** ??¢??°?????????????£???????????????¨???????????? */
	private final static int GROUP_INFO_EATING_MINUTES = 2;

	/** ??§??????????????¶??????????´????????????? */
	private static int[] seatsCondition = new int[SEATS];

	/** ???????????????????????????????????? */
	private static boolean openFlag = true;

	/** ???????????°???????????°????????? */
	private static int lastArrivalGroup = -1;

	/** ????????°???????????° */
	private static int watingGroups = 0;

	/** ??£????????????????????????????????? */
	private static int passedMinutes = 0;

	/**
	 * ???????????????????¨?????????¢??°??????????????????????????????????????????
	 *
	 * @param args
	 *            ?????¨????????????
	 * @throws IOException
	 * @throws NumberFormatException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		// ??\?????????????????????
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputList = new ArrayList<Integer>();
        String line = null;
        while((line = br.readLine()) != null) {
            inputList.add(Integer.parseInt(line));
        }

		// ??¨??¢??°??????????????°???????????¨?????°??¨?£??????????????±???????
		setGroupInfo();

		while (openFlag) {

			// ???????????§?¬??????°??????????????°?????????
			if (passedMinutes % INTERVAL == 0) {
				lastArrivalGroup++;
				watingGroups++;
			}

			// ????????°??????????????????????????°???????????????
			if (watingGroups == 0) {
				passedMinutes++;
				continue;
			}

			boolean vacancyFlag = true; // ??????????????¨?????????
			int nextGroup = lastArrivalGroup - watingGroups + 1; // ????????????????????°???????????????

			// ????????°???????????????????????????????????¨????????´????????????????????????????????????????????§????????????
			while (watingGroups != 0 && vacancyFlag) {
				int numberOfPersons = groupInfo[nextGroup][GROUP_INFO_PERSONS]; // ???????????°?????????????????°

				// ???????????°????????????????????§????????§????????????????±???????
				int seatNumber = getSeatNumber(numberOfPersons);

				if (seatNumber != -1) {

					// ????????§????????§???????????£?????´????????§??????????????????????¨??????????
					for (int i = 0; i < numberOfPersons; i++) {
						seatsCondition[seatNumber] = passedMinutes
								+ groupInfo[nextGroup][GROUP_INFO_EATING_MINUTES];
						seatNumber++;
					}

					// ??°????????????????????????????¨??????????
					watingTimes[nextGroup] = passedMinutes
							- groupInfo[nextGroup][GROUP_INFO_ARRIVAL];

					// ????????°???????????°????????????
					watingGroups--;
					nextGroup = lastArrivalGroup - watingGroups + 1;
				} else {
					vacancyFlag = false;
				}
			}

			passedMinutes++;

			// ???????????°??????????????§??£??????????????????????????????
			if (nextGroup == GROUP - 1) {
				openFlag = false;
			}
		}

		for (int i : inputList) {
			System.out.println(watingTimes[i]);
		}
	}

	private static void setGroupInfo() {

		for (int i = 0; i < GROUP; i++) {
			groupInfo[i][GROUP_INFO_ARRIVAL] = i * INTERVAL;
			groupInfo[i][GROUP_INFO_PERSONS] = (i % 5 == 1 ? 5 : 2);
			groupInfo[i][GROUP_INFO_EATING_MINUTES] = 17 * (i % 2) + 3
					* (i % 3) + 19;
		}

	}

	private static int getSeatNumber(int numberOfPersons) {

		int seatNumber = 0; // ???????????§?????????
		int vacancySeats = 0; // ????????°

		for (int i = 0; i < SEATS; i++) {

			// ??????????????¨?????£?????§?????????????????????
			if (seatsCondition[i] <= passedMinutes) {
				seatsCondition[i] = 0;
			}

			if (seatsCondition[i] == 0) {

				// ??????????????§????????°???????????°????¢???????
				vacancySeats++;

				// ????????°??????????????°??¨??????????????°??????????????§??????????????????
				if (vacancySeats == numberOfPersons) {
					return seatNumber;
				}
			} else {

				// ??????????????§???????????°?????§?????????????¬?????§???????????????°???0?????????
				seatNumber = i + 1;
				vacancySeats = 0;
			}
		}

		// ????????????????????°-1?????????
		return -1;
	}
}