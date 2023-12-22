import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int res = 0;
		for(int i = 0; i < 2; i++) {
			int sum = 0;
			for(int j = 0; j < 4; j++) {
				int tmp;
				tmp = sc.nextInt();
				sum = sum + tmp;
			}
			if(res < sum)
				res = sum;
		}
		System.out.println(res);
	}
}