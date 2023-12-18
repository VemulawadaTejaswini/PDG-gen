import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long array[] = new long[num];
		for(int i = 0; i < num; i ++) {
			array[i] = sc.nextLong();
		}
		long maxFromLeft[] = new long[num];
		maxFromLeft[0] = array[0];
		for(int i = 1; i < num; i ++) {
			maxFromLeft[i] = Math.max(maxFromLeft[i - 1], array[i]);
		}
		long maxFromRight[] = new long[num];
		maxFromRight[num - 1] = array[num - 1];
		for(int i = num - 2; i >= 0; i --) {
			maxFromRight[i] = Math.max(maxFromRight[i + 1], array[i]);
		}
		System.out.println(maxFromRight[1]);
		for(int i = 1; i < num - 1; i ++) {
			System.out.println(Math.max(maxFromLeft[i - 1], maxFromRight[i + 1]));
		}
		System.out.println(maxFromLeft[num - 2]);
	}
}