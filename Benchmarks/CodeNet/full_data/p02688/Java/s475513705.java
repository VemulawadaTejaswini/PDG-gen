import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt(); //お菓子の個数
		boolean[] flag = new boolean[n];
		
		for(int i = 0; i < k; i++) {
			int d = stdIn.nextInt();
			
			for(int j = 0; j < d; j++) {
				int a = stdIn.nextInt();
				if(flag[a-1]==false) {
					flag[a-1] = true;
				}
			}
			
			
		}
		
		long cnt = 0;
		for(int i = 0; i < n; i++) {
			if(flag[i]==false) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
