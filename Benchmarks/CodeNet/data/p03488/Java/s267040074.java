import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int N = S.length()+1;
		char[] s = new char[N];
		for(int i = 0; i < N-1; i++)
			s[i] = S.charAt(i);
		s[N-1] = 'T';
		int x = sc.nextInt();
		int y = sc.nextInt();
		List<Integer> h = new ArrayList<>();
		List<Integer> v = new ArrayList<>();
		boolean ish = true;
		int temp = 0;
		int st = 0;
		int xmax = 0, ymax = 0;
		for(int i = 0; i < N; i++)
			if(s[i] == 'T') {
				st = i;
				x -= i;
				xmax += i;
				break;
			}
		for(int i = st; i < N; i++) {
			if(s[i] == 'F')
				temp++;
			else {
				if(ish) {
					h.add(temp);
					ish = false;
					xmax += temp;
				}
				else {
					v.add(temp);
					ish = true;
					ymax += temp;
				}
				temp = 0;
			}
		}
		xmax = Math.max(xmax, x);
		ymax = Math.max(ymax, y);
		int[] dph1 = new int[xmax*2+1];
		int[] dph2 = new int[xmax*2+1];
		dph1[xmax] = 1;
		for(int i = 0; i < h.size(); i++) {
			dph2 = new int[xmax*2+1];
			for(int j = 0; j <= xmax*2; j++) {
				if(h.get(i)+j <= xmax*2)
					dph2[h.get(i)+j] = Math.max(dph2[h.get(i)+j], dph1[j]);
				if(j-h.get(i) >= 0)
					dph2[j-h.get(i)] = Math.max(dph2[j-h.get(i)], dph1[j]);
			}
			dph1 = dph2.clone();
		}
		int[] dpv1 = new int[ymax*2+1];
		int[] dpv2 = new int[ymax*2+1];
		dpv1[ymax] = 1;
		for(int i = 0; i < v.size(); i++) {
			dpv2 = new int[ymax*2+1];
			for(int j = 0; j <= ymax*2; j++) {
				if(v.get(i)+j <= ymax*2)
					dpv2[v.get(i)+j] = Math.max(dpv2[v.get(i)+j], dpv1[j]);
				if(j-v.get(i) >= 0)
					dpv2[j-v.get(i)] = Math.max(dpv2[j-v.get(i)], dpv1[j]);
			}
			dpv1 = dpv2.clone();
		}
		if(dph2[xmax+x] == 1 && dpv2[ymax+y] == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}