import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int l_t = 0, r_t = 0, x = 0, y = 0, z = 0;
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			int l = 0, r = 0;
			for(int j = 0; j < S.length(); j++) {
				if(S.charAt(j) == '(')
					l++;
				else {
					if(l > 0)
						l--;
					else
						r++;
				}
			}
			if(l > 0 && r > 0) {
				if(r <= y) {
					y -= r;
					y += l;
				}
				else {
					x += r-y;
					y += l;
				}
			}
			else
				z += l;
			l_t += l;
			r_t += r;
		}
		System.out.println(l_t == r_t && z >= x ? "Yes" : "No");
	}

}