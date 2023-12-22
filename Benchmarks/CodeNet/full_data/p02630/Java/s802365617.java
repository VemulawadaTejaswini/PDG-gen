import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());
		String a_str = scanner.next();
		String[] a_str_list = a_str.split(" ", 0);
		System.out.println(a_str_list[0]);
		System.out.println(a_str_list[1]);
		System.out.println(a_str_list[2]);
		System.out.println(a_str_list[3]);
		
		int[] a = new int[n];
		for(int i =0; i < n; i++) {
			a[i] = Integer.parseInt(a_str_list[i]);
		}
		
		int q = Integer.parseInt(scanner.next());
		int[] b = new int[q];
		int[] c = new int[q];
		for (int i = 0; i < q; i++) {
			String bc = scanner.next();
			String[] bc_list = bc.split(" ", 0);
			b[i] = Integer.parseInt(bc_list[0]);
			c[i] = Integer.parseInt(bc_list[1]);
		}
		
		int sum = 0;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j] == b[i]) {
					a[j] = c[i];
				}
				sum += a[j];
			}
			System.out.println(sum);
		}

	}

}