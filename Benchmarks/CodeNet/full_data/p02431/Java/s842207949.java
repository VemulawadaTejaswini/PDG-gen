import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		String[] commandList = initCommand();
		doCommnand(commandList);
	}

	private static void doCommnand(String[] commandList) {
		int[] vectorList = new int[200000] ;
		int vectorIndex = -1;
		for (int i=0; i< commandList.length; i++) {
			String command = commandList[i];
			String[] commandDetail = command.split(" ", -1);
			if (commandDetail[0].equals("0")) {
				int value = Integer.parseInt(commandDetail[1]);
				if ( value < -1000000000 || value > 1000000000) {
					throw new IllegalArgumentException("command is illegal");
				}
				vectorIndex++;
				vectorList[vectorIndex] = value;
			} else if (commandDetail[0].equals("1")) {
				int index = Integer.parseInt(commandDetail[1]);
				if (0 <= index && index <= vectorIndex) {
					int value = vectorList[index];
					System.out.println(value);
				}
			} else if (commandDetail[0].equals("2")) {
				if (vectorIndex >= 0) {
					vectorIndex--;
				}
			}
		}
	}

	private static String[] initCommand() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numCommandStr = br.readLine();
		int commandNum = Integer.parseInt(numCommandStr);
		if (commandNum < 1 || commandNum > 200000) {
			throw new IllegalArgumentException("1 <= commandNum <= 200000");
		}

		String[] commandList = new String[commandNum];

		for (int i=0; i< commandNum; i++) {
			String command = br.readLine();
			if (command == null || command.isEmpty()) {
				throw new IllegalArgumentException("command is empty");
			}
			commandList[i] = command; 
		}
		return commandList;
	}
}

