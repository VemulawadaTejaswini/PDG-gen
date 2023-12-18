import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int cnt[] = new int[5];
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			switch(sc.next().charAt(0)) {
			case 'M':
				cnt[0]++;
				break;
			case 'A':
				cnt[1]++;
				break;
			case 'R':
				cnt[2]++;
				break;
			case 'C':
				cnt[3]++;
				break;
			case 'H':
				cnt[4]++;
				break;
			}
		}
		long ans = 0;
		for(int i=0; i<(1<<5); i++) {
			int c=0;
			long tmp=0;
			for(int j=0; j<5; j++) {
				if(((i>>j)&1)==1) {
					if(c==0) {
						tmp = cnt[j];
					} else {
						tmp = tmp * cnt[j];
					}
					c++;
				}
			}
			if(c==3){
				ans += tmp;
			}
		}
		System.out.println(ans);
		sc.close();
	}

}
