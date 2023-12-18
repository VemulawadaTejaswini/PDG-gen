import java.util.Scanner;

public class Main {
	int H, W;
	
	// true is drop
	public boolean test(String me, String oth,
			int size, int start,
			char L, char R) {
		int left = -1;
		int right = size;
		
		for (int i=me.length()-1; i>=0; i--) {
			if (oth.charAt(i) == R) {
				left--;
				if (left < -1) {
					left = -1;
				}
			} else if (oth.charAt(i) == L) {
				right++;
				if (right > size) {
					right = size;
				}
			}
			if (me.charAt(i) == L) {
				left++;
			} else if (me.charAt(i) == R) {
				right--;
			}
			if (left+1 >= right) {
				return true;
			}
		}
		if (start <= left || start >= right) {
			return true;
		}
		return false;
	}
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		W = in.nextInt();

		int N = in.nextInt();
		int startY = in.nextInt()-1;
		int startX = in.nextInt()-1;
		
		String me = in.next();
		String oth = in.next();
		in.close();
		
		boolean isDropLR = test(me, oth, W, startX, 'L', 'R');
		boolean isDropUD = test(me, oth, H, startY, 'U', 'D');
		
		if (isDropLR || isDropUD) {
			System.out.println("NO");			
		} else {
			System.out.println("YES");			
		}
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}

}
