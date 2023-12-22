import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.next());
		ArrayList<Integer> a_list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			a_list.add(scanner.nextInt());
		}
		//String[] a_str = scanner.next();
		
		//ArrayList<String> a_str_list = a_str.split(" ", 0);
//		System.out.println(a_str_list[0]);
//		System.out.println(a_str_list[1]);
//		System.out.println(a_str_list[2]);
//		System.out.println(a_str_list[3]);
		
		int[] a = new int[n];
		for(int i =0; i < n; i++) {
			a[i] = a_list.get(i);
		}
		
		int q = Integer.parseInt(scanner.next());
		int[] b = new int[q];
		int[] c = new int[q];
		for (int i = 0; i < q; i++) {
			//String bc = scanner.nextLine();
			ArrayList<Integer> bc_list = new ArrayList<>();
			bc_list.add(scanner.nextInt());
			bc_list.add(scanner.nextInt());
			b[i] = bc_list.get(0);
			c[i] = bc_list.get(1);
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
			sum = 0;
		}

	}

}
