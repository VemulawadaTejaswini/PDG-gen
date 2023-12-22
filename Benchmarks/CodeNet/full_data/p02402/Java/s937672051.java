import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;

	private void mainrun() {
		scan = new Scanner(System.in);

		cal(scan.nextInt());

		scan.close();
	}

	private void cal(int n) {
		long sum,num,max,min;
		sum = 0;
		min = Long.MAX_VALUE;
		max = Long.MIN_VALUE;

		for(int i = 0;i < n;i++) {
			num = scan.nextLong();
			sum += num;
			min = Math.min(min, num);
			max = Math.max(max, num);

		}

		System.out.println(min + " " + max + " " + sum);
	}
}
