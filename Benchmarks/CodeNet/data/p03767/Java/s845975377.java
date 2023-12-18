import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		Long result = 0l;
		int n = in.nextInt();
		int[] a = new int[n*3];

		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		Arrays.sort(a);
		
		for (int i = n; i < n * 2; i++) {
			result += a[i];
		}

		System.out.println(result); 
	}
}