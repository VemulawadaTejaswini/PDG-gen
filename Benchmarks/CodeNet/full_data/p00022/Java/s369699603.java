import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int nextsize = in.nextInt();
	int size;
	while (nextsize != 0) {
	 size = nextsize;
	 int max = -100001;
	 int nums = -100001;
	 for (int num = 0; num < size; num++) {
		int a = in.nextInt();
		nums = Math.max(nums + a, a);
		max = Math.max(max, nums);
	 }
	 System.out.println(max);
	 nextsize = in.nextInt();
	}
 }

}