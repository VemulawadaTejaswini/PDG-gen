import java.util.ArrayList;
import java.util.List;

public class Main {
	public static int a;
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		a = s.nextInt();
		int b = s.nextInt();
		List<boolean[]> taps =new ArrayList<>();
		for(int i=1;;) {
			addTaps(taps);
			if(count(taps)>=b) {
				System.out.println(taps.size());
				break;
			}
		}
	}
	public static void addTaps(List<boolean[]> taps) {
		if(taps.size() > 1) {
			for(boolean[] tap:taps) {
				boolean breakflg = false;
				for(int i=0;i<tap.length;i++) {
					if(!tap[i]) {
						tap[i]=true;
						breakflg = true;
						break;
					}
				}
				if(breakflg) {
					break;
				}
			}
		}
		taps.add(new boolean[a]);
	}
	public static int count(List<boolean[]> taps) {
		int count =0;
		for(boolean[] tap:taps) {
			for(boolean isUsed:tap) {
				if(!isUsed) {
					count++;
				}
			}
		}
		return count;
	}
}