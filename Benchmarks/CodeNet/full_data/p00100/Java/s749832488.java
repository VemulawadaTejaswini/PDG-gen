import java.util.Scanner;

public class Main {
	static class Worker {
		int number;
		long result;
		
		Worker (int number, long result) {
			this.number = number;
			this.result = result;
		}
		
		public void add(long result) {
			this.result += result;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag;
		Worker worker[];
		int index;

		n = sc.nextInt();
		while (n != 0) {
			worker = new Worker[n];
			index = 0;
			flag = true;
			for (int i = 0; i < n; i++) {
				int number = sc.nextInt();
				int cost   = sc.nextInt();
				int lots   = sc.nextInt();
				boolean flag2 = true;
				for (int j = 0; j < index; j++) {
					if (worker[j].number == number) {
						worker[j].add((long)(cost * lots));
						flag2 = false;
					}
				}
				if (flag2) {
					worker[index] = new Worker(number, (long)(cost * lots));
					index++;
				}
			}
			
			for (int i = 0; i < index; i++) {
				if (1000000 <= worker[i].result) {
					System.out.println(worker[i].number);
					flag = false;
				}
			}
			if (flag) {
				System.out.println("NA");
			}
			
			n = sc.nextInt();
		}
	}
}