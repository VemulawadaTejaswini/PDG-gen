import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			long [] array = new long [n];
			long [] array2 = new long [n];
			for (int i=0; i<n; i++) {
				 array[i] = array2[i] = sc.nextLong();
			}
			int times = sc.nextInt();
			for (int i=0; i<times; i++) {
				int b = sc.nextInt();
				int m = sc.nextInt();
				int e = sc.nextInt();
				for (int k=0; k< e - b; k++) {
					int move = b + k;
					int target = b + ((k + (e-m)) % (e - b));
					//System.out.println(array2[target] + "  " +  array[move]);
					array2[target] = array[move];
				}
				for (int j=0; j<n; j++) array[j] = array2[j];
			}
			for (int i=0; i<n - 1; i++) System.out.print(array[i] + " ");
			System.out.println(array[n - 1]);
		}
	}
}
