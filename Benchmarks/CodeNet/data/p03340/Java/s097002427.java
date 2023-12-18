import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");
		int[] a = new int[arr.length];
		for(int i=0 ;i<a.length; i++)
			a[i] = Integer.parseInt(arr[i]);
		sc.close();

		int count=0;
		int begin=0;
		int xor=0;
		int add=0;
		for(int i=0; i<a.length; ) {
//			System.out.print(begin+", "+i+": "+(xor^a[i])+", "+(add+a[i]));
			if((xor^a[i]) == (add+a[i])) {
				xor ^= a[i];
				add += a[i];
				i++;
			} else {
				// count result
				count += i-begin;
				// update
				xor ^= a[begin];
				add -= a[begin];
				begin++;
			}
//			System.out.println(": "+count);
		}

		// count left results
		int tmp = a.length-begin;
		count += tmp*(tmp+1)/2;

		System.out.println(count);
	}
}
