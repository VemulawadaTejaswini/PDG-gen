import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SpinDice sd = new SpinDice();
		Dice2 di = new Dice2();
		byte[] dice = new byte[6];
		di.createDice(dice);
		byte num = di.inputNum();
		byte[][] diceNum = new byte[num][2];
		di.inputArray(diceNum);
		di.spinDiceExec(dice, diceNum);
	}
}

class Dice extends ToolOfDice {
	SpinDice sd;
	public void createDice(byte[] dice) {
		byte[] baseArray = new byte[6];
		inputArray(baseArray);
		for (int i = 0; i < dice.length; i++) {
			dice[i] = baseArray[i];
		}
	}
	
	public void spinDiceExec(byte[] dice) {
		String operation = "";
		operation = inputWord();
		char[] operationArray = new char[operation.length()];
		divideWord(operationArray, operation);
		for (int i = 0; i < operationArray.length; i++) {
			sd = new SpinDice();
			sd.spinDice(dice, operationArray[i]);
		}
	}
	
	public void showDice(byte[] dice) {
		for (int i = 0; i < dice.length; i++) {
			if (i < dice.length - 1) {
				System.out.print(dice[i] + " ");
			} else {
				System.out.println(dice[i]);
			}
		}
	}
}

class Dice2 extends Dice{
	public void spinDiceExec(byte[] dice, byte[][] diceNum) {
		long count = 0;
		for (int i = 0; i < diceNum.length; i++) {
			while (dice[1] != diceNum[i][1]) {
				sd = new SpinDice();
				if(count > 0 && count % 4 == 0){
					sd.spinDice(dice, 'W');
				}else {
					sd.spinDice(dice, 'N');
				}
				count++;
			}
			while (dice[0] != diceNum[i][0]) {
				sd = new SpinDice();
				sd.spinDice(dice, 'W');
			}
			System.out.println(dice[2]);
		}
	}
}

class SpinDice extends ToolOfDice {
	byte[] keepArray;
	byte tmpCount;
	
	public SpinDice() {
		keepArray = new byte[2];
		tmpCount = 0;
	}
	
	public void spinDice(byte[] dice, char operation) {
		byte[] tmpArray = new byte[4];
		keepDice(keepArray, operation);
		initArray(tmpArray);
		tmpCount = 0;
		for (int i = 0; i < dice.length; i++) {
			if (i == keepArray[0] || i == keepArray[1]) {
				continue;
			} else {
				tmpArray[tmpCount++] = dice[i];
			}
		}
		byte direction = 0;
		switch (operation) {
			case 'N':
				direction = -1;
				break;
			case 'S':
				direction = 1;
				break;
			case 'E':
				direction = 1;
				break;
			case 'W':
				direction = -1;
				break;
			default:
				break;
		}
		if(direction > 0){
			direction = -1;
			for (int i = 0; i < 3; i++) {
				swapDiceSqare(tmpArray, direction);
			}
		}else {
			swapDiceSqare(tmpArray, direction);
		}
		tmpCount = 0;
		for (int i = 0; i < dice.length; i++) {
			if (i == keepArray[0] || i == keepArray[1]) {
				continue;
			} else if (tmpCount < tmpArray.length) {
				dice[i] = tmpArray[tmpCount++];
			}
		}
	}
	
	public void keepDice(byte[] dice, char operation) {
		if (operation == 'N' || operation == 'S') {
			keepArray[0] = 2;
			keepArray[1] = 3;
		} else if (operation == 'E' || operation == 'W') {
			keepArray[0] = 1;
			keepArray[1] = 4;
		}
	}
	
	public void swapDiceSqare(byte[] array, byte direction) {
		byte tmp = array[array.length - 1];
		array[array.length - 1] = array[array.length - 2];
		array[array.length - 2] = tmp;
		for (int i = 0; i < array.length; i++) {
			tmp = -1;
			if (i + direction < 0) {
				tmp = array[i];
				array[i] = array[array.length - i + direction];
				array[array.length - i + direction] = tmp;
			} else if (i + direction >= array.length) {
				tmp = array[i];
				array[i] = array[array.length - (i + direction)];
				array[array.length - (i + direction)] = tmp;
			} else {
				tmp = array[i];
				array[i] = array[i + direction];
				array[i + direction] = tmp;
			}
		}
	}
}

class ToolOfDice {
	Scanner sc;
	
	public ToolOfDice() {
		sc = new Scanner(System.in);
	}
	
	public void inputArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextByte();
		}
	}
	
	public void inputArray(byte[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = sc.nextByte();
			}
		}
	}
	
	public void divideWord(char[] array, String word) {
		for (int i = 0; i < word.length(); i++) {
			array[i] = word.charAt(i);
		}
	}
	
	public String inputWord() {
		String word;
		word = sc.next();
		return word;
	}
	
	public byte inputNum() {
		byte num = sc.nextByte();
		return num;
	}
	
	public void initArray(byte[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
	}
}
