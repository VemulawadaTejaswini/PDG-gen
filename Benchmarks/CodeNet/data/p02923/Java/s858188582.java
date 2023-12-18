import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N1 = sc.nextInt();
		int tmp = sc.nextInt();
		int chk = 0;
		int count = 0;
		int[] ans = new int[N1];
		for (int i = 1; i < N1; i++) {
			chk = sc.nextInt();
			if (tmp < chk) {
				tmp = chk;
				count = 0;
				continue;
			}
			if (tmp >= chk) {
				tmp = chk;
				ans[i] = count++;
			}
		}
		
		int anss = 0;
		for(int i = 0 ; i < N1 ; i++) {
			anss = Math.max(anss, ans[i]);
			
		}
		
		System.out.println(anss);
	}
}