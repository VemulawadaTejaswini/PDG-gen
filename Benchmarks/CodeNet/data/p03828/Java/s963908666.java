import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		int n = 1000;
		//入力データを処理して、結果を出力
		Set<Integer> insu_set = new HashSet<>();
		List<Integer> insu_list = new ArrayList<>();

		for(int i = 2; i <= n; i++) {
			int num = i;
			for(int j = 2; j <= n;) {		
				if(num % j == 0) {
					insu_set.add(j);
					insu_list.add(j);
					num = num / j;
				} else {
					j++;
				}
			}
		}

		List<Integer> keisan = new ArrayList<>();
		for(int i : insu_set) {
			int count = Collections.frequency(insu_list, i);
			keisan.add(count);
		}

		int yakusu_kosu = 1;
		for(int i : keisan) {
			yakusu_kosu = yakusu_kosu * (i + 1);
		}

		int waru = (int)(Math.pow(10, 9)) + 7;
		System.out.println(yakusu_kosu % waru);
	}
}