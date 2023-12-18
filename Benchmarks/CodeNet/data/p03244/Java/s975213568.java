import java.util.*;
public class Main {

	public static int mode(int[]a) {
		int count = 1;
		int maxcount = 1;
		int mode = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] == a[i-1]) {
				count += 1;
				if(count >= maxcount) {
					mode = a[i];
					maxcount = count;
				}
			}
			else
				count = 1;
		}
		return mode;
	}
	public static int mode2(int[]a, int mode) {
		int count = 1;
		int maxcount = 1;
		int mode2;
		if(a[0] != mode) mode2 = a[0];
		else mode2 = 0;
		for(int i = 1; i < a.length; i++) {
			if(a[i] == mode) continue;
			if(a[i] == a[i-1]) {
				count += 1;
				if(count >= maxcount) {
					mode2 = a[i];
					maxcount = count;
				}
			}
			else {
				count = 1;
				if(mode2 == 0)
					mode2 = a[i];
			}
		}
		return mode2;
	}
	public static int count(int[]a, int x) {
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == x)
				count += 1;	
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] vodd = new int[n/2];
		int[] veven = new int[n/2];
		for(int i = 0; i < n/2; i++) {
			vodd[i] = sc.nextInt();
			veven[i] = sc.nextInt();
		}
		Arrays.sort(vodd);
		Arrays.sort(veven);
		int modevodd = mode(vodd);
		int modeveven = mode(veven);
		int modenumvodd = count(vodd, modevodd);
		int modenumveven = count(veven, modeveven);
		if(modevodd != modeveven)
			System.out.println(n - modenumvodd - modenumveven);
		else
			System.out.println(Math.min(n - modenumvodd - count(veven, mode2(veven, modeveven)),n - count(vodd, mode2(vodd, modevodd)) - modenumveven));
	}

}
