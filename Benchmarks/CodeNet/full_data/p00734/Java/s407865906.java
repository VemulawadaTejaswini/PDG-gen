import java.util.*;
public class Main {
	Scanner sc;
	
	void run() {
		sc = new Scanner(System.in);
		while (true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m == 0) break;
			int[] taro = new int[n];
			int[] hanako = new int [m];
			int score = 0;
			for(int i=0;i<n;i++) {
				taro[i] = sc.nextInt();
				score += taro[i];
			}
			for(int i=0;i<m;i++) {
				hanako[i] = sc.nextInt();
				score -= hanako[i];
			}
			if(Math.abs(score) % 2 == 1) {
				System.out.println(-1);
				continue;
			}
			score /= 2;
			Arrays.sort(taro);
			Arrays.sort(hanako);
			int anst=-1,ansh=-1;
			int max = 201;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(taro[i] - hanako[j] == score && taro[i] + hanako[j] < max ) {
						anst = taro[i];
						ansh = hanako[j];
						max = anst + ansh;
					}
				}
			}
			if (max == 201) System.out.println(-1);
			else System.out.println(anst + " " + ansh);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	
}