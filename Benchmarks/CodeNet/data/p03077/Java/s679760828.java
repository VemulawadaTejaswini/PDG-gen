import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long people = sc.nextLong();
		long minCapacity = 0;
		for (int i = 0; i < 5; i++) {
			long capacity = sc.nextLong();
			if (minCapacity == 0) {
				minCapacity = capacity;
			} else {
				if (minCapacity > capacity) {
					minCapacity = capacity;
				}
			}
		}
		long count = people / minCapacity;
		System.out.println(count + 5);
		sc.close();
	}
}