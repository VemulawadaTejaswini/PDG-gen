import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] exist = new boolean [32];

		int total = 0;

		for (int i=0;i<n;i++) {
			int tmp = sc.nextInt();
			total ^= tmp;
			exist[Integer.numberOfTrailingZeros(tmp)] = true;
		}

		System.out.println(calc(total,exist));
	}

	static int calc (int total, boolean[] exist) {
		int count = 0;
		while (total > 0) {
			int top = 31-Integer.numberOfLeadingZeros(total);
			if(exist[top]) {
				total ^= ((1 << (top+1))-1);
				count++;
			} else {
				return -1;
			}
		}
		return count;
	}

}
