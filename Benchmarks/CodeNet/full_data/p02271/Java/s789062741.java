import java.util.Scanner;

class Recursion {
	static int[] aArrays = new int[20];
	static int gIndex = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			aArrays[i] = sc.nextInt();
			gIndex++;
		}
		int q = sc.nextInt();
		int[] mArrays = new int[200];
		int index = 0;
		for (int i = 0; i < q; i++) {
			mArrays[i] = sc.nextInt();
			index++;
		}
		
		for (int i = 0; i < index; i++) {
			if (isMatch(0, 0, mArrays[i])) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
	}
	
	public static boolean isMatch(int j, int S, int T) {
			if (S == T) {
				return true;
			}
			for (int i = j; i < gIndex; i++) {
				if (isMatch(i + 1, S + aArrays[i], T)) {
					return true;
				}
			}
			return false;
		}
}