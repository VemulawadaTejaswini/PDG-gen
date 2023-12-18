import java.util.*;

public class Main {
	
	public static boolean judge(String s[], int r, int l) {
		if(s[r].charAt(l) != '#')return false;
		if(s[r - 1].charAt(l) != '#' && s[r + 1].charAt(l) != '#' && s[r].charAt(l - 1) != '#' && s[r].charAt(l + 1) != '#')
			return false;
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		String s[] = new String[h + 2];
		StringBuffer tmp = new StringBuffer();
		for(int i = 0; i < w + 2; ++i)
			tmp.append('.');
		s[0] = tmp.toString();
		StringBuffer tmp2 = new StringBuffer();
		for(int i = 1; i <= h; ++i) {
			tmp2.append('.');
			s[i] = sc.next();
			tmp2.append(s[i]);
			tmp2.append('.');
			s[i] = tmp2.toString();
			tmp2.delete(0,  tmp2.length());
		}
		s[h + 1] = tmp.toString();
		sc.close();
		String ans[] = {"Yes", "No"};
		int a = 0, t = -1;
		for(int i = 1; i <= h; ++i) {
			t = -1;
			for(int j = 1; j <= w; ++j) {
				if(s[i].charAt(j) == '#') {
					if(!judge(s, i, j)) {
						t = 0;
						a = 1;
						break;
					}
				}
			}
			if(t != -1) 
				break;
		}
		System.out.println(ans[a]);
	}

}
