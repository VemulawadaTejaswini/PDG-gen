import java.util.Scanner;
 
public class Main {
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] strs = new String[N];
		for (int i=0; i<N; i++) {
			strs[i] = in.next();
		}
		in.close();
		
		int endACount = 0;
		int startBCount = 0;
		int doubleCount = 0;
		int middleABCount = 0;
		
		for (int i=0; i<N; i++) {
			boolean isStartB = false;
			if (strs[i].startsWith("B")) {
				startBCount++;
				isStartB = true;
			}
			if (strs[i].endsWith("A")) {
				endACount++;
				if (isStartB) {
					doubleCount++;
				}
			}
			int len = strs[i].length();
			middleABCount += (len - strs[i].replace("AB", "").length()) / 2;
		}
		
		long ret = 0;
		if (endACount == 0 || startBCount == 0) {
			
		} else if (endACount == startBCount) {
			if (doubleCount == endACount) {
				ret = endACount - 1;
			} else {
				ret = Math.min(endACount, startBCount);
			}
		} else {
			ret = Math.min(endACount, startBCount);
		}
		ret += middleABCount;
		
		System.out.println(ret);
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
