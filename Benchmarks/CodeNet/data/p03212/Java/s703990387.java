import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		sc.close();
		List<String> list = new ArrayList<String>();
		String[] num = {"3", "5", "7"};
		for(int a = 0; a < 3; a++) {
			//list.add(num[a]);
			for(int b = 0; b < 3; b++) {
				//list.add(num[a] + num[b]);
				for(int c = 0; c < 3; c++) {
					list.add(num[a] + num[b] + num[c]);
					for(int d = 0; d < 3; d++) {
						list.add(num[a] + num[b] + num[c] + num[d]);
						for(int e = 0; e < 3; e++) {
							list.add(num[a] + num[b] + num[c] + num[d] + num[e]);
							for(int f = 0; f < 3; f++) {
								list.add(num[a] + num[b] + num[c] + num[d] + num[e] + num[f]);
								for(int g = 0; g < 3; g++) {
									list.add(num[a] + num[b] + num[c] + num[d] + num[e] + num[f] + num[g]);
									for(int h = 0; h < 3; h++) {
										list.add(num[a] + num[b] + num[c] + num[d] + num[e] + num[f] + num[g] + num[h]);
										for(int i = 0; i < 3; i++) {
											list.add(num[a] + num[b] + num[c] + num[d] + num[e] + num[f] + num[g] + num[h] + num[i]);
											for(int j = 0; j < 3; j++) {
												list.add(num[a] + num[b] + num[c] + num[d] + num[e] + num[f] + num[g] + num[h] + num[i] + num[j]);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		List<Long> li = new ArrayList<Long>();
		//System.out.println(list.size());
		for(String t : list) {
			if(isCheck(t)){
				li.add(Long.parseLong(t));
			}
		}
		//System.out.println(li.size());
		int cnt = 0;
		for(Long i : li) {
			if(i <= N) {
				//System.out.println(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static boolean isCheck(String t) {
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		for(int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if(c == '3') {
				flag1 = true;
			}
			if(c == '5') {
				flag2 = true;
			}
			if(c == '7') {
				flag3 = true;
			}
			if(flag1 && flag2 && flag3) {
				return true;
			}
		}
		return false;
	}
}