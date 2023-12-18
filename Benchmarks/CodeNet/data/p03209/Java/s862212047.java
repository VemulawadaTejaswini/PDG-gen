import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //整数の入力
		long x = sc.nextLong();
		System.out.println(count(n, x));
		
	}
	
	public static long count(int level, long end) {
		long total = 0;
		if (level == 0) {
			return 1;
		}
		end--;
		if (end <= 0) {
			return total;
		}
		total += count(level - 1, end);
		end -= size(level - 1);
		if (end <= 0) {
			return total;
		}
		end--;
		total++;
		if (end <= 0) {
			return total;
		}
		total += count(level - 1, end);
		return total;
	}
	
	public static long size(int level) {
		if (level == 0) {
			return 1;
		} else {
			return size(level - 1) * 2 + 3;
		}
	}
}