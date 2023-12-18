import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int monster_h = sc.nextInt();
		int skill_n = sc.nextInt();

		List<Integer> skill_list = new ArrayList<>();

		for (int i = 0; i < skill_n; i++) {
			skill_list.add(sc.nextInt());
		}

		int total_skill = skill_list.stream().mapToInt(Integer::intValue).sum();
		String yesNo = (total_skill > monster_h) ? "Yes" : "No";

		System.out.println(yesNo);
		sc.close();
	}
}
