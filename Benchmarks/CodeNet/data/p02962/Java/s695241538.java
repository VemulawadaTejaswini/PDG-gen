import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] arrS = sc.next().toCharArray();
		char[] arrT = sc.next().toCharArray();
		int max = 0;
		for (int i = 0; i < arrS.length; i++) {
			if (arrS[i] != arrT[0]) {
				continue;
			}
			int idxS = i;
			int idxT = 0;
			while (arrS[idxS % arrS.length] == arrT[idxT % arrT.length]) {
				idxS++;
				idxT++;
				if (idxS / 2 > arrS.length) {
					System.out.println(-1);
					return;
				}
			}
			if (max < idxT / arrT.length) {
				max = idxT / arrT.length;
			}
		}
		System.out.println(max);
	}
}
