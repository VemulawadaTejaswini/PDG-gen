import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[][] table = new int[d][d];
		for(int i=0;i<n;i++) {
			table[in.nextInt()%d][in.nextInt()%d]++;
		}
		int max = -1;
		for(int i=0;i<d;i++) {
			for(int j=0;j<d;j++) {
				if(table[i][j]>max) max = table[i][j];
			}
		}
		int sqrt = 0;
		while(sqrt*sqrt<max) {
			sqrt++;
		}
		List<int[]> list = new ArrayList<>();
 		for(int i=0;i<d;i++) {
			for(int j=0;j<d;j++) {
				if(table[i][j]>(sqrt-1)*sqrt) {
					int[] tmp = {i,j};
					list.add(tmp);
				}
			}
		}
		if(list.size()<=1) System.out.println((sqrt-1)*d);
		else {
			int ans = -1;
			for(int i=0;i<list.size();i++) {
				for(int j=i+1;j<list.size();j++) {
					int min = sub(list.get(i),list.get(j),d);
					if(min>ans) ans = min;
				}
			}
			System.out.println((sqrt-1)*d+ans);
		}
		in.close();

	}
	
	public static int sub(int[] tmp1,int[] tmp2,int d) {
		int min1 = Math.max(Math.abs(tmp1[0]-tmp2[0]), Math.abs(tmp1[1]-tmp2[1]));
		int min2 = Math.max(Math.abs(tmp1[0]+d-tmp2[0]), Math.abs(tmp1[1]-tmp2[1]));
		int min3 = Math.max(Math.abs(tmp1[0]-tmp2[0]), Math.abs(tmp1[1]+d-tmp2[1]));
		int min4 = Math.max(Math.abs(tmp1[0]+d-tmp2[0]), Math.abs(tmp1[1]+d-tmp2[1]));
		int min5 = Math.max(Math.abs(tmp1[0]+d-tmp2[0]), Math.abs(tmp1[1]-d-tmp2[1]));
		int min6 = Math.max(Math.abs(tmp1[0]-d-tmp2[0]), Math.abs(tmp1[1]-tmp2[1]));
		int min7 = Math.max(Math.abs(tmp1[0]-tmp2[0]), Math.abs(tmp1[1]-d-tmp2[1]));
		int min8 = Math.max(Math.abs(tmp1[0]-d-tmp2[0]), Math.abs(tmp1[1]-d-tmp2[1]));
		int min9 = Math.max(Math.abs(tmp1[0]-d-tmp2[0]), Math.abs(tmp1[1]+d-tmp2[1]));
		return Math.min(Math.min(Math.min(min1, min2), Math.min(min3, min4)), Math.min(Math.min(min5, min6), Math.min(min7, Math.min(min8, min9))));
	}

}
