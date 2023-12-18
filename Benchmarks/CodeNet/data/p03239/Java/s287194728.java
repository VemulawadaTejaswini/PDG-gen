import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		int n, t, tmenor = 0, cmenor = 0, fin = 0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		t = scanner.nextInt();
		int time[] = new int[n];
		int cost[] = new int[n];
		for(int i = 0; i < n; i++) {
			time[i] = scanner.nextInt();
			cost[i] = scanner.nextInt();
			if(tmenor > time[i]) {
				tmenor = time[i];
			}
			if(cmenor > cost[i]) {
				cmenor = cost[i];
			}
		}
		System.out.println(tmenor);
		}
	}
