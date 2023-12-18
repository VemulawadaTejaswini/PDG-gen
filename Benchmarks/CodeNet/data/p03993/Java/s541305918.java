import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		int[] map = new int[N+1];
		for(int i=1;i<=N;i++) {
			map[i] = cin.nextInt();
		}
		int res = 0;
		for(int i=1;i<=N;i++) {
			if (map[map[i]] == i) {
				res++;
			}
		}
		System.out.println(res/2);
	} 
}