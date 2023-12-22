import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int diff= Integer.MIN_VALUE;
		for (int j=1; j<n; j++){
			min = Math.min(min, sc.nextInt());
			diff = Math.max(diff, sc.nextInt()-min);
		}
		System.out.println(diff);
	}
}