import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nm = toIntArray(sc.nextLine().split(" "));
		int prefectureCount = nm[0];
		int cityCount = nm[1];
		int[] prefectureArray = new int[cityCount];
		int[] cityInfoArray = new int[cityCount];
		for (int i = 0; i < cityCount; i++) {
			int[] py = toIntArray(sc.nextLine().split(" "));
			prefectureArray[i] = py[0];
			cityInfoArray[i] = py[1];
		}
		int[] seqArray = new int[cityCount];
		for (int i = 0; i < cityCount; i++) {
			int number = 1;
			for (int j = 0; j < cityCount; j++) {
				if (prefectureArray[i] == prefectureArray[j]
				&& cityInfoArray[i] > cityInfoArray[j]) {
					number++;
				}
			}
			seqArray[i] = number;
		}
		for (int i = 0; i < cityCount; i++) {
			System.out.println(
				leftPad(String.valueOf(prefectureArray[i]))
				 + leftPad(String.valueOf(seqArray[i]))
			);
		}
	}

	private static void print(int[] intArray) {
		for (int n : intArray) {
			System.out.println(leftPad(String.valueOf(n)));
		}
	}

	private static String leftPad(String arg) {
		int len = arg.length();
		if (len >= 6) {
			return arg;
		}
		int diff = 6 - len;
		StringBuilder buf = new StringBuilder(diff);
		for (int i = 0; i < diff; i++) {
			buf.append('0');
		}
		return buf.toString().concat(arg);
	}

	private static int[] toIntArray(String[] args) {
		int len = args.length;
		int[] intArray = new int[len];
		for (int i = 0; i < len; i++) {
			intArray[i] = Integer.parseInt(args[i]);
		}
		return intArray;
	}
}
