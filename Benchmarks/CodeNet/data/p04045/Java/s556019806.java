import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		TreeSet<Integer> ts = new TreeSet<>();
		Integer[] num = {0,1,2,3,4,5,6,7,8,9};
		ts.addAll(Arrays.asList(num));
		for(int i = 0; i < k; i++) {
			ts.remove(sc.nextInt());
		}
		Integer[] sel = new Integer[ts.size()];
		ts.toArray(sel);
		int pay = 0;
		for(int i = 0; i < sel.length; i++) {
			for(int j = 0; j < sel.length; j++) {
				for(int h = 0; h < sel.length; h++) {
					for(int g = 0; g < sel.length; g++) {
						StringBuilder sb = new StringBuilder();
						sb.append(sel[i]);
						sb.append(sel[j]);
						sb.append(sel[h]);
						sb.append(sel[g]);
						String s = sb.toString();
						while(s.charAt(0)=='0') {
							if(s.length()>1) s=s.substring(1);
							else {
								s="";
								break;
							}
						}
						if(s.length()>0) {
							pay = Integer.parseInt(s);
							if(pay >= n) {
								System.out.println(pay);
								return;
							}
						}
					}
				}
			}
		}
	}
}
