import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static int max;
	public static List<Integer> a;
	public static int result;
	public static boolean end;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		a = new ArrayList();
		max = 0;
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
			if (a.get(i) > max) {
				max = a.get(i);
			}
			if (a.get(i) < min) {
				min = a.get(i);
			}
		}
		result = 1;
		end = false;
		calc(0, 0, min);
		System.out.println(result);
	}
	
	public static int calc (int i, int count, int num) {
		if (num > max) {
			return count;
		} else {
			if (end) {
				return 0;
			}
			if (i >= a.size() && count <= 1) {
				result = num;
				end = true;
				return calc(0, 0, --num);
			} else {
				if (i >= a.size() || count >= 2) {
					return calc(0, 0, --num);
				} else {
					if (a.get(i) % num != 0) {
						++count;
					}
					return calc(++i, count, num);
				}
			}
		}
	}
}