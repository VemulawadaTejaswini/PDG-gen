import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean flag = true;
		int q = Integer.parseInt(in.nextLine());
		String[] ans = new String[300000];
		int start = 100005;
		int end = 100006;
		for(int i = 0; i < s.length(); i++) {
			ans[end] = s.substring(i, i + 1);
			end += 1;
		}
		for(int i = 0; i < q; i++) {
			String cur = in.nextLine();
			if(cur.length() == 1) {
				flag = (flag == true) ? false : true;
			}else {
				String[] gt = cur.split(" ");
				if(gt[1].equals("1")) {
					if(flag == true) {
						ans[start] = gt[2];
						start -= 1;
					}else {
						ans[end] = gt[2];
						end += 1;
					}
				}else {
					if(flag == true) {
						ans[end] = gt[2];
						end += 1;
					}else {
						ans[start] = gt[2];
						start -= 1;
					}
				}
			}
		}
		if(flag == false) {
			for(int i = end - 1; i > start; i--) {
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}else {
			for(int i = start + 1; i < end; i++) {
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
	}
} 
