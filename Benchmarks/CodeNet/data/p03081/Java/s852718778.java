import java.util.*;
public class Main {
	static int num;
	static int magic;
	static int type[] = new int[(int)200100];
	static int opponent[] = new int[(int)200100];
	static boolean isL[] = new boolean[(int)200100];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		magic = sc.nextInt();
		String oppos = sc.next();
		for(int i = 0; i < num; i ++) {
			type[i] = oppos.charAt(i) - 'A';
		}
		for(int i = 0; i < magic; i ++) {
			opponent[i] = sc.next().charAt(0) - 'A';
			isL[i] = sc.next().charAt(0) == 'L' ? true : false;
		}
		System.out.println(Math.max(bisect(true) - bisect(false) - 1, 0));
	}

	static int bisect(boolean max) {
		int ng = max ? -1 : num;
		int ok = max ? num : -1;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if(isOK(mid)) {
				ok = mid;
			}else {
				ng = mid;
			}
		}
		return ok;
	}
	static boolean isOK(int index) {//will dissapear
		for(int i = 0; i < magic; i ++) {
			if(opponent[i] == type[index]) {
				index += isL[i] ? -1 : 1;
			}
			if(index == -1 || index == num) {
				return true;
			}
		}
		return false;
	}
}