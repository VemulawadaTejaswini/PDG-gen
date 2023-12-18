import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> AcList = new ArrayList<Integer>();
		int penalty = 0;

		for (int i = 0; i < M; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			// 既に正解済みの場合はcontinue
			if (AcList.contains(p)) {
				continue;
			}

			if (s.equals("AC")) {
				AcList.add(p);
			} else {
				penalty++;
			}
		}
		sc.close();

		System.out.println(AcList.size() + " " + penalty);
	}
}
