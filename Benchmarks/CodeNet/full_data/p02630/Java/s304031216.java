import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		ArrayList<Long> list = new ArrayList<Long>();

		for(int i = 0;i < n;i++) {
			list.add(scan.nextLong());
		}

		int q = scan.nextInt();
		ArrayList<Long> befor = new ArrayList<Long>();
		ArrayList<Long> after = new ArrayList<Long>();
		ArrayList<Long> distance = new ArrayList<Long>();
		long sum = 0;

		for(int i = 0;i < n;i++) {
			sum += list.get(i);
		}

		for(int i = 0;i < q;i++) {
			befor.add(scan.nextLong());
			after.add(scan.nextLong());
			distance.add(after.get(i) - befor.get(i));
		}

		for(int j = 0;j < q;j++) {
			for(int i = 0;i < n;i++) {
				if(list.get(i) == befor.get(j)) {
					list.set(i , after.get(j));
					count++;
				}
			}
			sum += distance.get(j) * count;
			System.out.println(sum);
			count = 0;
		}
	}
}
