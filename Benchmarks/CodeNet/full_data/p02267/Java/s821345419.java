import java.util.Scanner;

public class Main {
	
	public static int solution(int[] a1, int[] a2) {
		int count = 0;
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if (a2[i] - a1[j] == 0) {
					count += 1;
					break;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a1 = new int[n];
		for (int i = 0; i < n; i++){
		    a1[i] = in.nextInt();
		}
		int n2 = in.nextInt();
		int[] a2 = new int[n2];
		for (int i = 0; i<n2; i++){
		    a2[i] = in.nextInt();
		}
		int out = solution(a1,a2);
		System.out.println(out);
	}

}
