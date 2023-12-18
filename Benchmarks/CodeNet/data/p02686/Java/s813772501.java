import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int n = sc.nextInt();

		boolean allClose = true;
		Kakko[] list = new Kakko[n];
		int leftPos = -1;
		int rightPos = n;
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			while (s.contains("()")) {
				s = s.replace("()", "");
			}
			if (!s.equals("")) {
				allClose = false;
				Kakko k = new Kakko(i, s);
				if (k.putLeft()) {
					if (leftPos < 0) {
						list[0] = k;
					} else {
						int j = 0;
						for (j = leftPos; j >= 0; j--) {
							if (k.getRightCloseCount() >= list[j].getRightCloseCount()) {
								break;
							}
						}
						System.arraycopy(list, j + 1, list, j + 2, leftPos - j);
						list[j + 1] = k;
					}
					leftPos++;
				} else {
					if (rightPos >= n) {
						list[n - 1] = k;
					} else {
						int j = 0;
						for (j = rightPos; j < n; j++) {
							if (k.getLeftCloseCount() <= list[j].getLeftCloseCount()) {
								break;
							}
						}
						System.arraycopy(list, rightPos, list, rightPos - 1, j - rightPos);
						list[j - 1] = k;
					}
					rightPos--;
				}
			}
		}

//		System.out.println("leftPosi " + leftPos + " rightPos " + rightPos);
//		for (int j = 0; j < n; j++) {
//			System.out.println("i " + j + " " + list[j].getId() + " " + list[j].getLeftCloseCount() + " " + list[j].getRightCloseCount());
//		}

		boolean correct = true;
		int leftRemainder = 0;
		int rightRemainder = 0;
		if (!allClose) {
			for (int i = 0; i <= leftPos; i++) {
				if (leftRemainder < list[i].getRightCloseCount())  {
					correct = false;
					break;
				}
				leftRemainder += list[i].getLeftCloseCount() - list[i].getRightCloseCount();
//				System.out.println(list[i].getId() + " " + list[i].getLeftCloseCount() + " " + list[i].getRightCloseCount());
			}
//			System.out.println("");
			if (correct) {
				for (int i = rightPos; i < n; i++) {
					if (rightRemainder < list[i].getLeftCloseCount())  {
						correct = false;
						break;
					}
					rightRemainder += list[i].getRightCloseCount() - list[i].getLeftCloseCount();
//					System.out.println(list[i].getId() + " " + list[i].getLeftCloseCount() + " " + list[i].getRightCloseCount());
				}
			}
		}

		// 出力
		System.out.println(correct && leftRemainder == rightRemainder || allClose ? "Yes" : "No");
		sc.close();
	}

	static class Kakko {
		private int id;
		private int leftCloseCount;
		private int rightCloseCount;
		Kakko (int id, String s) {
			this.id = id;
			if (s.indexOf("(") < 0) {
				rightCloseCount = s.length();
				leftCloseCount = 0;
			} else if (s.indexOf(")") < 0) {
				rightCloseCount = 0;
				leftCloseCount = s.length();
			} else {
				rightCloseCount = s.indexOf("(");
				leftCloseCount = s.length() - rightCloseCount;
			}
		}
		public int getId() {
			return id;
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
