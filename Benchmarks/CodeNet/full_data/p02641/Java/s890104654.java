import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		Integer[] array = new Integer[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(array);
//		for(int a : array) {
//			System.out.println(a);
//		}

		List<Integer> list = Arrays.asList(array);
		if(!(list.contains(x))) {
			System.out.println(x);
			return;
		}

		int ans=10000000;
		for(int i=1;i<=100;i++) {
			int min1 = Math.abs(x-i);
			if(!(list.contains(min1))) {
				System.out.println(min1);
				return;
			}
			int max1 = x+i;
			if(!(list.contains(max1))) {
				System.out.println(max1);
				return;
			}
		}

	}
}
