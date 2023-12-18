import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] arrS = sc.next().toCharArray();
		char[] arrT = sc.next().toCharArray();
		int max = 0;
		int i = 0;
		int nextS = 0;
		int nextT = 0;
		while (i < arrS.length) {
			if (arrS[i] != arrT[0]) {
				i++;
				nextS = 0;
				nextT = 0;
				continue;
			}
			int idxS = i;
			int idxT = 0;
			if (nextS != 0) {
				idxS = nextS + nextT;
				idxT = nextT;
				nextS = 0;
				nextT = 0;
			}
			while (arrS[idxS % arrS.length] == arrT[idxT % arrT.length]) {
				if (idxT != 0 && idxS < arrS.length && idxT < arrT.length) {
					if (nextS == 0) {
						if (arrS[idxS % arrS.length] == arrT[0]) {
							nextS = idxS;
							nextT = 1;
						}
					} else {
						if (arrS[idxS % arrS.length] == arrT[nextT]) {
							nextT++;
						} else {
							nextS = 0;
							nextT = 0;
						}
					}
				}
				idxS++;
				idxT++;
				if (idxS - i > arrS.length && idxT >= arrT.length) {
					System.out.println(-1);
					return;
				}
			}
			int length = idxT / arrT.length;
			if (max < length) {
				max = length;
			}
			if (length >= 1) {
				i = i + length * arrT.length;
				nextS = 0;
				nextT = 0;
			} else if (nextS != 0) {
				i = nextS;
			} else {
				i++;
			}
		}
		System.out.println(max);
	}
}
