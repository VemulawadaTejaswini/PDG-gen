import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Num[][] fld = new Num[sc.nextInt()][sc.nextInt()];

		for (int i = 0; i < fld.length; i++) {
			String[] line = sc.next().split("");
			for (int y = 0; y < fld.length; y++) {
				fld[i][y] = ".".equals(line[y]) ? new Num(0) : new Num(1);
			}
		}
		
		int count = 0;
		boolean isNotAllOne = true;
		while(isNotAllOne) {
			isNotAllOne = isReveseTarget(fld);
			if (isNotAllOne) {
				count++;
				Num.revese(fld);
			}
		}
		
		System.out.println(count);

	}
	
	private static boolean isReveseTarget(Num[][] fld) {
		int revesrCount = 0;
		for (int i = 0; i < fld.length; i++) {
			for (int y = 0; y < fld.length; y++) {
				int n = fld[i][y].i;
				if(n == 1) continue;
				int flgCount = 0;
				if(isExsitIndex(fld,i+1,y) && fld[i+1][y].i == 1) flgCount++;
				if(isExsitIndex(fld,i-1,y) && fld[i-1][y].i == 1) flgCount++;
				if(isExsitIndex(fld,i,y+1) && fld[i][y+1].i == 1) flgCount++;
				if(isExsitIndex(fld,i,y-1) && fld[i][y-1].i == 1) flgCount++;
				if(flgCount > 0) {
					fld[i][y].isRevese = true;
					revesrCount++;
				}
			}
		}
		return revesrCount != 0;
	}
	
	private static boolean isExsitIndex(Num[][] nss,int x,int y) {
		if(nss.length -1 < x)return false;
		if(0 > x)return false;
		if(nss[0].length -1 < y)return false;
		if(0 > y)return false;
		return true;
	}
	
	static class Num {
		int i;
		boolean isRevese = false;

		static int revese(Num[][] nss) {
			int count = 0;
			for (Num[] ns : nss) {
				for (Num n : ns) {
					if (n.isRevese) {
						n.i = 1;
						n.isRevese = false;
						count++;
					}
				}
			}
			return count;
		}

		Num(int i_) {
			i = i_;
		}
		public String toString() {
			return String.valueOf(i);
		}
	}

}
