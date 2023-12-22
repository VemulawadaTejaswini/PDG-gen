import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int cnt = scn.nextInt();

			List<Integer> nums = new ArrayList<>();
			for(int i=0; i<cnt; i++) {
				nums.add(scn.nextInt());
			}

			Collections.sort(nums);

			List<Integer> ans = new ArrayList<>();
			Set<Integer> sames = new HashSet<>();

			for(int i=0; i<nums.size(); i++) {
				boolean isMod0 = false;
				int num = nums.get(i);
				for(int j=0; j<ans.size(); j++) {
					int a = ans.get(j);
					if((num>>1) < a) {
						if(num == a) {
							isMod0 = true;
							sames.add(a);
						}
						break;
					}
					if(num % a == 0) {
						isMod0 = true;
						break;
					}
				}
				if(!isMod0) {
					ans.add(nums.get(i));
				}
			}

			System.out.println(ans.size() - sames.size());
		}
	}
}
