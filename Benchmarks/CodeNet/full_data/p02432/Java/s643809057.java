//package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static int MIN_VALUE = -1000000000;
	public static int MAX_VALUE =  1000000000;
	public static int MAX_COMMAND = 400000;
	public static int MIN_COMMAND = 1;
	public static void main(String[] args) throws Exception {
		String[] commandList = initCommand();
		doCommnand(commandList);
	}

	private static void doCommnand(String[] commandList) {
		int startIndex = commandList.length;
		int endIndex = commandList.length;
		
		int[] valueList = new int[commandList.length*2+1];
		
		for (int i=0; i< commandList.length; i++) {
			String command = commandList[i];
			String[] commandDetail = command.split(" ", -1);
			if (commandDetail[0].equals("0")) {
				int direction = Integer.parseInt(commandDetail[1]);
				if (direction != 0 && direction != 1) {
					throw new IllegalArgumentException("command is illegal:" + direction);
				}
				int value = Integer.parseInt(commandDetail[2]);
				if (value < MIN_VALUE || value > MAX_VALUE) {
					throw new IllegalArgumentException("command is illegal");
				}
				int valueIndex = -1;
				if (direction == 0) {
					valueIndex = startIndex - 1; 
					valueList[valueIndex] = value;
					startIndex = valueIndex;
				} else if (direction == 1) {
					valueIndex = endIndex;
					valueList[valueIndex] = value;
					endIndex = valueIndex + 1;
				}
			} else if (commandDetail[0].equals("1")) {
				int index = Integer.parseInt(commandDetail[1]);
				if (0 <= index && index < endIndex - startIndex) {
					int value = valueList[startIndex+index];
					System.out.println(value);
				}
			} else if (commandDetail[0].equals("2")) {
				int direction = Integer.parseInt(commandDetail[1]);
				if (direction != 0 && direction != 1) {
					throw new IllegalArgumentException("command is illegal:" + direction);
				}
				if (direction == 0) {
					startIndex++;
				} else if (direction == 1) {
					endIndex--;
				}
			}
			//System.out.println(Arrays.toString(valueList));
		}
	}

	private static String[] initCommand() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numCommandStr = br.readLine();
		int commandNum = Integer.parseInt(numCommandStr);
		if (commandNum < MIN_COMMAND || commandNum > MAX_COMMAND) {
			throw new IllegalArgumentException(MIN_COMMAND + " <= commandNum <= " + MAX_COMMAND);
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

