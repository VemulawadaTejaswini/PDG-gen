
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		char s[] = (sc.next()+"T").toCharArray();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int cnt=0;
		boolean isx=true;
		ArrayList<Integer> xl = new ArrayList<Integer>();
		ArrayList<Integer> yl = new ArrayList<Integer>();
		for(int i=0; i<s.length; i++) {
			if(s[i]=='T') {
				if(isx) {
					xl.add(cnt);
				}else {
					yl.add(cnt);
				}
				cnt=0;
				isx = !isx;
			}else {
				cnt++;
			}
		}

		boolean dpx[][] = new boolean[xl.size()+1][16001];
		dpx[0][8000]=true;
		for(int i=0; i<xl.size(); i++) {
			for(int j=0; j<16001; j++) {
				if(dpx[i][j]) {
					dpx[i+1][j+xl.get(i)] |= dpx[i][j];
					dpx[i+1][j-xl.get(i)] |= dpx[i][j];
				}
			}
		}
		boolean dpy[][] = new boolean[yl.size()+1][16001];
		dpy[0][8000]=true;
		for(int i=0; i<yl.size(); i++) {
			for(int j=0; j<16001; j++) {
				if(dpy[i][j]) {
					dpy[i+1][j+yl.get(i)] |= dpy[i][j];
					dpy[i+1][j-yl.get(i)] |= dpy[i][j];
				}
			}
		}

		if(dpx[xl.size()][8000+x] && dpy[yl.size()][8000+y]) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

}
