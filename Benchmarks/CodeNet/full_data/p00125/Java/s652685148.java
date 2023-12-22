import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int y1 = sc.nextInt();
			int m1 = sc.nextInt();
			int d1 = sc.nextInt();
			int y2 = sc.nextInt();
			int m2 = sc.nextInt();
			int d2 = sc.nextInt();
			if(y1 < 0 || m1 < 0 || d1 < 0 || y2 < 0 || m2 < 0 || d2 < 0){
				break;
			}
			int res = getdays(y2, m2, d2) - getdays(y1, m1, d1);
			System.out.println(res);
		}
	}
	
	int getdays(int y, int m, int d) {
		if (m <= 2) {
			y--;
			m += 12;
		}
		int dy = 365 * (y - 1);
		int c = y / 100;
		int dl = (y >> 2) - c + (c >> 2);
		int dm = (m * 979 - 1033) >> 5;
		return dy + dl + dm + d - 1;
	}
	
	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}