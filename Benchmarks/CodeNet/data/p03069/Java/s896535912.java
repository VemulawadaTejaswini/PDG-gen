import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int left=0;
		int right=N;
		int to_black=0;
		int to_white=0;
		for (int i=1;i<N;i++) {
			if (S.charAt(i)=='.') {
				left++;
			} else {
				break;
			}
		}
		for (int i=N-2;i>=0;i--) {
			if (S.charAt(i)=='#') {
				right--;
			} else {
				break;
			}
		}

		for (int i=left+1;i<N;i++) {
			if (S.charAt(i)=='.') {
				to_black++;
			}
		}
		for (int i=0;i<right-1;i++) {
			if (S.charAt(i)=='#') {
				to_white++;
			}
		}
		System.out.println(Math.min(to_black,to_white));
	}
}