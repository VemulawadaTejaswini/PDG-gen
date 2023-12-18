import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long countMax = sc.nextLong();
		long array[] = new long[num];
		long sorted[][] = new long[num][2];
		for(int i = 0; i < num; i ++) {
			array[i] = sc.nextLong();
			sorted[i][0] = array[i];
			sorted[i][1] = i;
		}
		Arrays.sort(sorted, (a, b) -> Long.compare(a[0], b[0]));
		int next[] = new int[num];
		int prv = (int)sorted[0][1];
		for(int i = 1; i < num; i ++) {
			if(sorted[i][0] == sorted[i - 1][0]) {
				next[(int)sorted[i - 1][1]] = (int)sorted[i][1];
			}else {
				next[(int)sorted[i - 1][1]] = prv;
				prv = (int)sorted[i][1];
			}
		}
		next[(int)sorted[num - 1][1]] = prv;

		int count = 1;
		int tmpIndex = 0;
		int lastIndex[] = new int[num];
		while(tmpIndex != num) {
			if(next[tmpIndex] <= tmpIndex) {
				lastIndex[count - 1] = tmpIndex;
				count ++;
			}
			tmpIndex = next[tmpIndex] + 1;
		}
		countMax = (countMax - 1) % count;
		if(countMax == count - 1) {
			System.out.println(); return;
		}

		StringBuilder ans = new StringBuilder();
		tmpIndex = lastIndex[(int)countMax];
		while(tmpIndex < num) {
			if(next[tmpIndex] <= tmpIndex) {
				ans.append(array[tmpIndex]+" ");
				tmpIndex ++;
			}else {
				tmpIndex = next[tmpIndex] + 1;
			}
		}
		System.out.println(ans);
	}
}