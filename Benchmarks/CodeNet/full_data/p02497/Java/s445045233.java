import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mid;
		int last;
		int re;
		int sum;
		while (true) {
			mid = sc.nextInt();
			last = sc.nextInt();
			re = sc.nextInt();
			if (mid == -1 && last == -1 && re == -1) break;
			sum = mid + last;
			if (mid == -1 || last == -1) System.out.println("F");
			else if (sum >= 80) System.out.println("A");
			else if (sum >= 65 && sum < 80) System.out.println("B");
			else if (sum >= 50 && sum < 65) System.out.println("C");
			else if (sum >= 30 && sum < 50) {
				if (re >= 50) System.out.println("C");
				else System.out.println("D");
			}
			else System.out.println("F");
		}
	}
}