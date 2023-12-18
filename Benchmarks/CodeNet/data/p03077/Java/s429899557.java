import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long people = sc.nextLong();
		int num = 5;
		long carry[] = new long[num];
		for(int i = 0; i < num; i ++) {
			carry[i] = sc.nextLong();
		}
		Arrays.sort(carry);
		System.out.println(people / carry[0] + 5);
	}
}