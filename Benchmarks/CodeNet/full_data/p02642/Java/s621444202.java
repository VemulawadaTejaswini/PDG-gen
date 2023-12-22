import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int cnt = scn.nextInt();

			List<Integer> nums = new ArrayList<>();
			for(int i=0; i<cnt; i++) {
				nums.add(scn.nextInt());
			}

			int ans = 0;
			for(int i=0; i<nums.size(); i++) {
				boolean isMod0 = false;
				for(int j=0; j<nums.size(); j++) {
					if(j==i) {
						continue;
					}
					if(nums.get(i) % nums.get(j) == 0) {
						isMod0 = true;
						break;
					}
				}
				if(!isMod0) {
					ans++;
				}
			}

			System.out.println(ans);
		}
	}
}
