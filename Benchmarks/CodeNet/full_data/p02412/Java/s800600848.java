import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			List<int[]> numList = new ArrayList<int[]>();
			int cnt = 0;
			String tmp = scan.nextLine();
			int n, x;
			n = Integer.parseInt(tmp.split(" ")[0]);
			x = Integer.parseInt(tmp.split(" ")[1]);
			if (n == 0 && x == 0) {
				break;
			}
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n; j++) {
					for (int t = 1; t <= n; t++) {
						if (i + j + t == x && i != j && i != t && j != t) {
							if(check(i,t,j,numList) && check(i,j,t,numList) && check(t,i,j,numList) && check(t,j,i,numList) && check(j,i,t,numList) && check(j,t,i,numList)){
								int[] tmpNums = new int[3];
								tmpNums[0] = i;
								tmpNums[1] = j;
								tmpNums[2] = t;
								numList.add(tmpNums);
							}
						}
					}

				}
			}
			System.out.println(numList.size());
		}
	}

	public static boolean check(int i,int j ,int t,List<int[]> numList){
		for (int s = 0; s < numList.size(); s++) {
			int[] tmp = new int[3];
			tmp = numList.get(s);
			if (tmp[0] == i && tmp[1] == j && tmp[2] == t) {
				return false;
			}
		}
		return true;
	}

}

