import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long money[] = new long[4001];
		boolean flag[] = new boolean[4001];
		int order[] = new int[4001];
		
		final long threshold = 1000000;
		Scanner scanner = new Scanner(System.in);
		
		int n;
		
		n = scanner.nextInt();
		while (n != 0) {
			for(int i = 0; i < 4001; i++) {
				money[i] = 0;
				order[i] = 0;
				flag[i] = false;
			}
			int ord = 0;
			
			for(int i = 0; i < n; i++) {
				int id = scanner.nextInt();
				long cost = scanner.nextLong();
				long num = scanner.nextLong();
				
				money[id] += cost * num;
				
				if (flag[id] == false) {
					order[ord] = id;
					ord++;
					flag[id] = true;
				}
			} 
			
			boolean noOneFlag = true;
			
			for(int i = 0; i < 4001; i++) {
				if (money[order[i]] >= threshold) {
					System.out.println(order[i]);
					noOneFlag = false;
				}
			}
			
			if (noOneFlag == true) {
				System.out.println("NA");
			}
			n = scanner.nextInt();
		}
	}
}