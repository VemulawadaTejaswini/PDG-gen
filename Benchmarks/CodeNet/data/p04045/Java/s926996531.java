import java.util.*;

public class Main {
	private static final int NOT_FOUND = 10;

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			String n = s.next();
			int[] src = new int[n.length()];
			for (int i = 0; i < n.length(); i++) {
				src[i] = Integer.parseInt(n.substring(i, i + 1));
			}
			int k = s.nextInt();
			boolean[] d = new boolean[10];
			for (int i = 0; i < k; i++) {
				d[s.nextInt()] = true;
			}

			int minValue = getNextValue(d, 0);
			StringBuilder sb = new StringBuilder(src.length + 1);
			for (int i = src.length - 1; i >= 0; i--) {
				int c = src[i];
				int newValue = getNextValue(d, c);
				if (c != newValue) {
					if (newValue == NOT_FOUND) {
						if (i != 0) {
							src[i - 1]++;
						} else {
							sb.append(getNextValue(d, 1));
						}
						src[i] = minValue;
					} else {
						src[i] = newValue;
					}
					for (int j = i + 1; j < src.length; j++) {
						src[j] = minValue;
					}
				}
			}
			for (int i = 0; i < n.length(); i++) {
				sb.append(src[i]);
			}
			System.out.println(sb);
		}
	}

	public static int getNextValue(boolean[] d, int value) {
		for (int i = value; i < d.length; i++) {
			if (d[i] == false) {
				return i;
			}
		}
		return NOT_FOUND;
	}
}
