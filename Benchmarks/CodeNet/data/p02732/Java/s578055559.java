import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int[] dif = new int[n + 1];
		
		int[] a = new int[n];
		int[] nums = new int[n + 1];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			nums[a[i]]++;
		}
		
		for (int i = 1; i < n + 1; i++) {
			// System.out.println("i:" + i);
			
			int num = nums[i];
			// System.out.println("  num:" + num);
			
			int tmp = num * (num - 1) / 2;
			// System.out.println("  tmp:" + tmp);
			
			sum += tmp;
			dif[i] = tmp - ((num - 1) * (num - 2) / 2);
			if (tmp == 0)
				dif[i] = 0;
			// System.out.println("  dif[" + i + "]:" + dif[i]);
		}
		// System.out.println("sum:" + sum);
		
		for (int k = 0; k < n; k++) {
			// System.out.println("k:" + k);
			// System.out.println("  a[" + k + "]:" + a[k]);
			// System.out.println("  dif[a[" + k + "]]:" + dif[a[k]]);
			System.out.println(sum - dif[a[k]]);
		}
		
		sc.close();
	}
}
