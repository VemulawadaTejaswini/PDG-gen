import java.util.*;
import java.math.*;
public class Solution {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean flag = true;
		int q = Integer.parseInt(in.nextLine());
		List<String> ans = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			ans.add(s.substring(i, i + 1));
		}
		for(int i = 0; i < q; i++) {
			String cur = in.nextLine();
			if(cur.length() == 1) {
				flag = (flag == true) ? false : true;
			}else {
				String[] gt = cur.split(" ");
				if(gt[1].equals("1")) {
					if(flag == true) {
						ans.add(0, gt[2]);
					}else {
						ans.add(gt[2]);
					}
				}else {
					if(flag == true) {
						ans.add(gt[2]);
					}else {
						ans.add(0, gt[2]);
					}
				}
			}
		}
		if(flag == false) {
			for(int i = ans.size() - 1; i >= 0; i--) {
				System.out.print(ans.get(i));
			}
			System.out.print("\n");
		}else {
			for(int i = 0; i < ans.size(); i++) {
				System.out.print(ans.get(i));
			}
			System.out.print("\n");
		}
	}
} 
