import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<boolean[]> mask = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			mask.add(new boolean[64]);
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				mask.get(i)[sc.nextInt()] = true;
			}
		}
		int q = sc.nextInt();
		boolean[] flags = new boolean[64];
		Arrays.fill(flags, false);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int op = sc.nextInt();
			int index = sc.nextInt();
			switch (op) {
				case 0:
					if (flags[index]) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 1:
					for (int j = 0; j < 64; j++) {
						if (mask.get(index)[j]) {
							flags[j] = true;
						}
					}
					break;
				case 2:
					for (int j = 0; j < 64; j++) {
						if (mask.get(index)[j]) {
							flags[j] = false;
						}
					}
					break;
				case 3:
					for (int j = 0; j < 64; j++) {
						if (mask.get(index)[j]) {
							flags[j] = !flags[j];
						}
					}
					break;
				case 4:
					boolean flag = true;
					for (int j = 0; j < 64; j++) {
						if (mask.get(index)[j] && !flags[j]) {
							flag = false;
							break;
						}
					}
					if (flag) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 5:
					flag = false;
					for (int j = 0; j < 64; j++) {
						if (mask.get(index)[j] && flags[j]) {
							flag = true;
							break;
						}
					}
					if (flag) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 6:
					flag = true;
					for (int j = 0; j < 64; j++) {
						if (mask.get(index)[j] && flags[j]) {
							flag = false;
							break;
						}
					}
					if (flag) {
						sb.append(1);
					} else {
						sb.append(0);
					}
					sb.append('\n');
					break;
				case 7:
					int count = 0;
					for (int j = 0; j < 64; ++j) {
						if (mask.get(index)[j] && flags[j]) {
							++count;
						}
					}
					sb.append(count);
					sb.append('\n');
					break;
				case 8:
					BigDecimal bd = BigDecimal.valueOf(0L);
					BigDecimal bd2 = BigDecimal.valueOf(1L);
					long tmp = 1L;
					for (int j = 0; j < 64; j++) {
						if (!mask.get(index)[j]) {
							bd2 = bd2.multiply(BigDecimal.valueOf(2L));
							continue;
						}
						if (flags[j]) {
							bd = bd.add(bd2);
						}
						bd2 = bd2.multiply(BigDecimal.valueOf(2L));
					}
					sb.append(bd.toPlainString());
					sb.append('\n');
					break;
			}
		}
		System.out.print(sb.toString());
	}
}

