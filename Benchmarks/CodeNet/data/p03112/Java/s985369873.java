import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numS = sc.nextInt();
		int numT = sc.nextInt();
		int numQ = sc.nextInt();
		int num = numS + numT + numQ;
		long spot[][] = new long[numS + numT + numQ][3];
		for(int i = 0; i < numS; i ++) {
			spot[i][0] = sc.nextLong();
			spot[i][1] = 0;
		}
		for(int i = 0; i < numT; i ++) {
			spot[numS + i][0] = sc.nextLong();
			spot[numS + i][1] = 1;
		}
		for(int i = 0; i < numQ; i ++) {
			spot[numS + numT + i][0] = sc.nextLong();
			spot[numS + numT + i][1] = 2 + i;
		}
		Arrays.sort(spot, (a, b) -> Long.compare(a[0], b[0]));

		int indexQues[][] = new int[num][2];
		long diff[][] = new long[num][2];
		int index[] = new int[3];
		for(int i = 0; i < num; i ++) {
			diff[i][0] = (long)Math.pow(10, 12);
			for(int j = Math.max(i, index[(int)Math.min(spot[i][1], 2)]); j < num; j ++) {
				if(spot[j][1] != spot[i][1] && spot[j][1] < 2) {
					diff[i][0] = spot[j][0] - spot[i][0];
					index[(int)Math.min(spot[i][1], 2)] = j;
					if(spot[i][1] >= 2) {
						indexQues[i][0] = j;
					}
					break;
				}
			}
		}
		for(int i = 0; i < 3; i ++) {
			index[i] = num;
		}
		for(int i = num - 1; i >= 0; i --) {
			diff[i][1] = (long)Math.pow(10, 12);
			for(int j = Math.min(i, index[(int)Math.min(spot[i][1], 2)]); j >= 0; j --) {
				if(spot[j][1] != spot[i][1] && spot[j][1] < 2) {
					diff[i][1] = - spot[j][0] + spot[i][0];
					index[(int)Math.min(spot[i][1], 2)] = j;
					if(spot[i][1] >= 2) {
						indexQues[i][1] = j;
					}
					break;
				}
			}
		}
		for(int i = 0; i < num; i ++) {
			if(spot[i][1] >= 2) {
				spot[i][0] = Math.min(diff[i][0] + Math.min(diff[indexQues[i][0]][0], diff[indexQues[i][0]][1]),
					diff[i][1] + Math.min(diff[indexQues[i][1]][0], diff[indexQues[i][1]][1]));
			}
		}
		Arrays.sort(spot, (a, b) -> Long.compare(a[1], b[1]));
		for(int i = 0; i < num; i ++) {
			if(spot[i][1] < 2) { continue; }
			System.out.println(spot[i][0]);
		}
	}
}