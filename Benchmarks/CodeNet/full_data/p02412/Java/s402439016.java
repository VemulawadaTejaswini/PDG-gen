import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				
				if(n == 0 && x == 0) break;
				
				boolean used[] = new boolean[n];
				int count = 0;
				
				for(int i = 1; i <= n; i++) {
					used[i - 1] = true;
					for(int j = i + 1; j <= n; j++) {
						if(used[j - 1]) {
							continue;
						}
						used[j - 1] = true;
						for(int k = j + 1; k <= n; k++) {
							if(i + j + k == x) {
								count++;
							}
						}
						used[j - 1] = false;
					}
					used[i - 1] = false;
				}
				
				sb.append(count);
				sb.append("\n");
			}
			
			System.out.print(sb.toString());
		}
	}
}
