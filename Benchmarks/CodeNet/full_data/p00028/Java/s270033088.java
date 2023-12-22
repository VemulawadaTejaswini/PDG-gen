import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	final static int N = 10;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		List<Integer> data = new ArrayList<>();
		List<Integer> modes = new ArrayList<>(102);
		for(int i=0;i<=101;i++) {
			modes.add(0);
		}
		while(in.hasNext()) {
			int d = in.nextInt();
			data.add(d);
			modes.set(d, modes.get(d) + 1);
		}
		int mode_num = 0;
		for(int i=1;i<=100;i++) {
			if(mode_num < modes.get(i)) {
				mode_num = modes.get(i);
			}
		}
		for(int i=1;i<=100;i++) {
			if(mode_num == modes.get(i)) {
				System.out.println(i);
			}
		}
	}
}