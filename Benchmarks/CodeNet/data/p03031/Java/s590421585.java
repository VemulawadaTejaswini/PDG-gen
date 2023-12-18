import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int numberOfSwitch = stdIn.nextInt();
		int numberOfLights = stdIn.nextInt();

		stdIn.nextLine();//改行のため

		Map<Integer, LightSwitch> switchMap = new LinkedHashMap<>();
		// set input
		for (int i = 1; i <= numberOfLights; i++) {
			switchMap.put(i, new LightSwitch(i, stdIn.nextLine()));
		}
		for (int i = 1; i <= numberOfLights; i++) {
			switchMap.get(i).setMod(stdIn.nextInt());
		}

		// execute
		int allSize = (int) Math.pow(2, numberOfSwitch);
		int cnt = 0;

		for (int i = 0; i < allSize; i++) {

			String boolStr = String.format("%" + numberOfSwitch + "s", Integer.toBinaryString(i)).replaceAll(" ", "0");

			if (canAllLightUp(switchMap, boolStr)) {
				cnt++;
			}
		}

		System.out.println(cnt);

		stdIn.close();
	}

	private static boolean canAllLightUp(Map<Integer, LightSwitch> switchMap, String boolStr) {
		for (LightSwitch swt : switchMap.values()) {
			if (!swt.canLightsUp(boolStr)) {
				return false;
			}
		}

		return true;
	}
}

class LightSwitch {
	private int switchId;
	private Set<Integer> useSwitchSet = new HashSet<>();
	private int mod;

	public LightSwitch(int switchId, String useSwitchStr) {
		this.switchId = switchId;

		String[] strArray = useSwitchStr.split(" ");

		for (int i = 1; i < strArray.length; i++) {
			useSwitchSet.add(Integer.parseInt(strArray[i]));
		}
	}

	public boolean canLightsUp(String switchArrayStr) {
		int cnt = 0;

		for (Integer switchId : useSwitchSet) {
			if (switchArrayStr.charAt(switchId - 1) == '1') {
				cnt++;
			}
		}

		return cnt % 2 == mod;

	}

	public int getMod() {
		return mod;
	}

	public void setMod(int mod) {
		this.mod = mod;
	}

	public int getSwitchId() {
		return switchId;
	}

}