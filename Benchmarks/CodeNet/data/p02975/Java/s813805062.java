import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] ai = new int[N];
		int index = 0;
		int[] nums = new int[3];
		int[] numsCount = {0, 0, 0};
		boolean isNo = false;
		for (int i=0; i<N; i++) {
			ai[i] = in.nextInt();
			boolean isSame = false;
			for (int j=0; j<index; j++) {
				if (nums[j] == ai[i]) {
					isSame = true;
					numsCount[j]++;
					break;
				}
			}
			if (isSame == false && index >= 3) {
				isNo = true;
				break;
			}
			if (isSame == false) {
				nums[index] = ai[i];
				numsCount[index] = 1;
				index++;
			}
		}
		in.close();
		
		if (isNo) {
			System.out.println("No");
			return;
		}
		
		if (index == 1) {
			if (nums[0] == 0) {
				System.out.println("Yes");
				return;
			} else {
				System.out.println("No");
				return;
			}
		}
		if (N % 3 != 0) {
			System.out.println("No");
			return;
		}
		int unit = N/3;
		for (int i=0; i<index; i++) {
			if (numsCount[i] % unit != 0) {
				System.out.println("No");
				return;
			}
			if (numsCount[i] / unit == 2) {
				nums[2] = nums[i];
			}
		}
		int total = 0;
		for (int i=0; i<3; i++) {
			total = total ^ nums[i];
		}
		if (total == 0) {
			System.out.println("Yes");
			return;
		} else {
			System.out.println("No");
			return;
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
