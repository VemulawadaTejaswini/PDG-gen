import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private int[] a;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			int s = scan.nextInt();
			if ((n | s) == 0) break;
			
			a = new int[n];
			Arrays.fill(a, 0);
			
			int count = 0;
			
			StringBuffer str = new StringBuffer();
			while (true) {
				int p = 0;
				while (p < a.length && a[p] == 9) p++;
				if (p == a.length) break;
				
				if (p == 0) {
					a[0]++;
				}else {
					a[p]++;
					flat(p - 1);
				}
				
				boolean f = false;
				for (int i = 0; i < a.length; i++) {
					for (int j = 0; j < a.length; j++) {
						if (i != j && a[i] == a[j]) {
							f = true;
						}
					}
				}
				if (f) continue;
				
				int sum = 0;
				StringBuffer str2 = new StringBuffer();
				for (int i = 0; i < a.length; i++) {
					sum += a[i];
					str2.append(a[i]);
				}
				if (sum == s) {
					boolean flag = false; //前文字列中に合う文字列があるか
					for (int i = 0; i < str.length() / (n + 1); i++) {
						String nums = str.substring(i * (n + 1), i * (n + 1) + n + 1);
						int[] num = new int[n];
						for (int j = 0; j < n; j++) {
							try {
								num[j] = Integer.parseInt(nums.substring(j, j+1));
								//System.out.println(nums.substring(j, j+1));
							}catch (ArrayIndexOutOfBoundsException e) {
								System.out.println(j + "error:" + nums);
							}
						}
						//System.out.println(Arrays.toString(num));
						boolean flag2 = true; //numsの文字列は合うか
						for (int x = 0; x < n; x++) {
							boolean flag3 = false; //a[x]は合う文字があるか
							for (int y = 0; y < n; y++) {
								if (a[x] == num[y]) flag3 = true;
							}
							if (!flag3) {
								flag2 = false;
								break;
							}
						}
						if (flag2) {
							flag = true;
							break;
						}
					}
					if (!flag) {
						count++;
						str.append(str2);
						str.append(",");
					}
					//System.out.println(str);
				}
			}
			System.out.println(count);
		}
	}
	
	private void flat(int p) {
		for (int i = p; i >= 0; i--) a[i] = 0;
	}
	
	private void debug() {
		System.out.println();
	}

}