import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String[] nico = sc.nextLine().split(" ");
		int n = Integer.parseInt(nico[0]);
		int q = Integer.parseInt(nico[1]);

		int[] list = new int[n + 1];
		for (int i = 0; i < list.length; i++) {
			list[i] = 0;
		}
		
		for (int i = 0; i < q; i++) {
			String[] set = sc.nextLine().split(" ");
			int[] data = new int[set.length];
			
			for (int j = 0; j < set.length; j++) {
				data[j] = Integer.parseInt(set[j]);
			}

			list[data[0]] = list[data[0]] + data[1];

			int max = 0;
			int no = -1;
			for (int j = 0; j < list.length; j++) {
				int tmp = list[j];
				if (max < tmp) {
					max = tmp;
					no = j;
				}
			}
			System.out.println(no + " " + max);
		}
	}
}