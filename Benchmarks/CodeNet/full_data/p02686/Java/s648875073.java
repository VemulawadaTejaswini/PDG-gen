import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();

		Kakko[] list = new Kakko[n];
		int leftPos = -1;
		int rightPos = n;
		for (int i = 0; i < n; i++) {
			Kakko k = new Kakko(sc.next());
			if (k.putLeft()) {
				if (leftPos < 0) {
					list[0] = k;
				} else {
					for (int j = leftPos; j >= 0; j--) {
						if (k.getRightCloseCount() >= list[j].getRightCloseCount()) {
							list[j + 1] = k;
							break;
						} else {
							list[j + 1] = list[j];
						}
					}
				}
				leftPos++;
			} else {
				if (rightPos >= n) {
					list[n - 1] = k;
				} else {
					for (int j = rightPos; j < n; j++) {
						if (k.getLeftCloseCount() <= list[j].getLeftCloseCount()) {
							list[j - 1] = k;
							break;
						} else {
							list[j - 1] = list[j];
						}
					}
				}
				rightPos--;
			}
		}

		boolean correct = true;
		int leftRemainder = 0;
		for (int i = 0; i < n; i++) {
			if (leftRemainder < list[i].getRightCloseCount())  {
				correct = false;
				break;
			}
			leftRemainder += list[i].getLeftCloseCount() - list[i].getRightCloseCount();
		}

		// 出力
		System.out.println(correct && leftRemainder == 0 ? "Yes" : "No");
		sc.close();
	}

	static class Kakko {
		private int leftCloseCount;
		private int rightCloseCount;
		Kakko (String s) {
			int count = 0;
			while (count < s.length()) {
				if (s.substring(count, count + 1).equals(")")) {
					if (leftCloseCount > 0) {
						leftCloseCount--;
					} else {
						rightCloseCount++;
					}
				} else {
					leftCloseCount++;
				}
				count++;
			}
		}
		public int getLeftCloseCount() {
			return leftCloseCount;
		}
		public int getRightCloseCount() {
			return rightCloseCount;
		}
		public boolean putLeft() {
			return leftCloseCount > rightCloseCount ? true : false;
		}

	}
}
