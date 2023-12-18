import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int monster_kensu = sc.nextInt();
		int kill_kaisu = sc.nextInt();

		if (monster_kensu <= kill_kaisu) {
			System.out.println("0");
		} else {
			long count = monster_kensu - kill_kaisu;
			List<Integer> monster_list = new ArrayList<>();

			for (int i = 0; i < monster_kensu; i++) {
				monster_list.add(sc.nextInt());
			}

			Collections.sort(monster_list, Collections.reverseOrder());
          int attack_sum = 0;
          	if(count > 3){
				attack_sum = monster_list.stream().mapToInt(Integer::intValue).skip(3).sum();
            } else {
              attack_sum = monster_list.stream().mapToInt(Integer::intValue).skip(kill_kaisu).sum();
            }
          System.out.println(attack_sum);
		}
	}
}