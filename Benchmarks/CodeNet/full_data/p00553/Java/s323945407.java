import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int start = sc.nextInt();
			int target = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int total = 0;
			if (start<0) total = -start*a+b+c*target;
			else total = c*(target-start);
			System.out.println(total);
		}
	}
}
