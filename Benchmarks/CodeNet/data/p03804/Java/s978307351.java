import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 標準入力
		Scanner sc = new Scanner(System.in);

		String line1 = sc.nextLine();
		List<String> lines1 = Arrays.asList(line1.split(" "));
		Integer N = Integer.parseInt(lines1.get(0));
		Integer M = Integer.parseInt(lines1.get(1));

		List<String> Nlist = new ArrayList();
		List<String> Mlist = new ArrayList();

		for (int i = 0; i < N; i++) {
			Nlist.add(sc.nextLine());
		}
		for (int k = 0; k < M; k++) {
			Mlist.add(sc.nextLine());
		}
		String Ms = null;
		for (int j = 0; j < Mlist.size(); j++) {
			Ms = Mlist.get(j);
			for (int o = j; o < Nlist.size(); o++) {
				if (getRes(Ms, Nlist, o)) {
					break;
				}else {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

	public static boolean getRes(String Ms, List<String> Nlist, int l) {
		for (int p = l; p < Nlist.size() - l; p++) {
			if (Nlist.get(p).indexOf(Ms) >= 0)
				return true;
		}
		return false;
	}

}