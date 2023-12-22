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
					leftPos++;
					list[leftPos] = k;
				} else {
					rightPos--;
					list[rightPos] = k;
				}
			}
		}
		boolean correct = true;
		int leftRemainder = 0;
		int rightRemainder = 0;
		if (!allClose) {
			//ソート
			if (leftPos >= 0) {
				Arrays.sort(list, 0, leftPos, new KakkoComp());
			}
			if (rightPos <= list.length - 1) {
				Arrays.sort(list, rightPos, list.length - 1, new KakkoComp());
			}
			//カウント
			for (int i = 0; i <= leftPos; i++) {
				if (leftRemainder < list[i].getRightCloseCount())  {
					correct = false;
					break;
				}
				leftRemainder += list[i].getLeftCloseCount() - list[i].getRightCloseCount();
			}
			if (correct) {
				for (int i = rightPos; i < n; i++) {
					if (rightRemainder < list[i].getLeftCloseCount())  {
						correct = false;
						break;
					}
					rightRemainder += list[i].getRightCloseCount() - list[i].getLeftCloseCount();
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

	static class KakkoComp implements Comparator<Kakko> {

	    @Override
	    public int compare(Kakko o1, Kakko o2) {
	        // o1の方が昇順で上なら負の数を返す。
	    	int result = 0;
	    	if (o1.putLeft()) {
	    		result = o1.getRightCloseCount() - o2.getRightCloseCount();
	    	} else {
	    		result = o1.getLeftCloseCount() - o2.getLeftCloseCount();
	    	}
	        return result;
	    }
	}
}
