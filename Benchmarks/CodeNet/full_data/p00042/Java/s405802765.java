
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		ArrayList<Long> result2=new ArrayList<Long>();
		ArrayList<Long> result3=new ArrayList<Long>();
		while (true) {
			int w = sc.nextInt();
			if (w == 0) break;
			int n = sc.nextInt();

			int[][] list = new int[n][2];
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				String[] str2 = str.split(",");
				int num1 = Integer.parseInt(str2[0]);
				int num2 = Integer.parseInt(str2[1]);
				list[i][0] = num1;
				list[i][1] = num2;
			}
			long[][] result = new long[n][w + 1];
			result[0][list[0][1]] = list[0][0];
			for (int i = 0; i < n - 1; i++) {
				result[i + 1][list[i + 1][1]] = list[i + 1][0];
				for (int j = 1; j < w + 1; j++) {
					if (result[i][j] != 0&& j + list[i + 1][1] <= w&& result[i + 1][j + list[i + 1][1]] < result[i][j]+ list[i + 1][0])result[i + 1][j + list[i + 1][1]] = result[i][j]+ list[i + 1][0];
				}
			}
			long value = 0;
			long weight = 10000;
			for (int i = 0; i < w + 1; i++) {
				if (result[n - 1][i] > value) {
					value = result[n - 1][i];
					weight = i;
				} else if (result[n - 1][i] == value && weight > i) {
					value = result[n - 1][i];
					weight = i;
				}
			}
			result2.add(value);
			result3.add(weight);
			count++;
		}
		for(int i=1;i<count;i++){
			System.out.println("Case" + " " + i + ":");
			System.out.println("" + result2.get(i-1));
			System.out.println("" + result3.get(i-1));
		}
	}

}