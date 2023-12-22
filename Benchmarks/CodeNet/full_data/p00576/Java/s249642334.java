import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int num = sc.nextInt();
			List<Integer> pieces = new ArrayList<Integer>();
			for (int i=0; i<num; i++) pieces.add(sc.nextInt());
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int call = sc.nextInt()-1;
				int now = pieces.get(call);
				if ((now!=2019) && (!pieces.contains(now + 1))) {
					pieces.set(call, now+1);
				}
			}
			for (int i=0; i<num; i++) {
				System.out.println(pieces.get(i));
			}
		}
	}
}

