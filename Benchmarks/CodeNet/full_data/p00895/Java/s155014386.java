import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static final int[] di = {-1,-1,-1,0,0,1,1,1};
	public static final int[] dj = {-1,0,1,-1,1,-1,0,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			if (h == 0) {
				break;
			}
			char[][] s = new char[h][];
			for(int i=0;i<h;i++) {
				s[i] = sc.next().toCharArray();
			}
			ArrayList<String> found = new ArrayList<String>();
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					for(int k=0;k<8;k++) {
						StringBuilder sb = new StringBuilder();
						int ni = i;
						int nj = j;
						while(true) {
							sb.append(s[ni][nj]);
							ni = (ni + di[k] + h) % h;
							nj = (nj + dj[k] + w) % w;
							if (ni == i && nj == j) {
								break;
							}
						}
						found.add(sb.toString());
					}
				}
			}
			int maxl = 0;
			String maxs = "";
			Collections.sort(found);
			for(int i=0;i<found.size()-1;i++) {
				int l1 = found.get(i).length();
				int l2 = found.get(i+1).length();
				int l = Math.min(l1, l2);
				int matchl = 0;
				for(int j=0;j<=l;j++) {
					char c1 = j == l ? 'a' : found.get(i).charAt(j);
					char c2 = j == l ? 'b' : found.get(i+1).charAt(j);
					if (c1 != c2) {
						matchl = j;
						break;
					}
				}
				if (matchl >= maxl) {
					String matchs = found.get(i).substring(0, matchl);
					if (matchl > maxl || maxs.compareTo(matchs) > 0) {
						maxs = matchs;
					}
					maxl = matchl;
				}
			}
			if (maxl < 2) {
				System.out.println(0);
			}else{
				System.out.println(maxs);
			}
		}
	}

}