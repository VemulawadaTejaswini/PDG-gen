import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int Q = reader.nextInt();
		String S = reader.next();
		String ans = "";
		int[] arr = new int[N];
		for (int i = 0; i < N-1; i++) {
			arr[i+1]+=arr[i];
			if (S.charAt(i)=='A' && S.charAt(i+1)=='C') {
				arr[i+1]++;
			}
		}
		for (int i = 0; i < Q; i++) {
			int beginIndex = reader.nextInt() - 1;
			int endIndex = reader.nextInt() - 1;
			int a = arr[endIndex] - arr[beginIndex];
			ans += Math.max(a, 0) + "\n";
		}
		System.out.println(ans);
		reader.close();
	}
}



