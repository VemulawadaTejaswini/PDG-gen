import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n,cnt = 1,ba = 0;
			int[] play = new int[10];
			String a;
			
			n = scan.nextInt();
			if(n == 0) break;
			
			a = scan.next();
			char[] f = a.toCharArray();
			
			for(int i = 0; i < 100; i++) {
				if(f[i] == 'M') {
					play[cnt]++;
				} else if(f[i] == 'S'){
					ba = play[cnt] + ba + 1;
					play[cnt] = 0;
				} else if(f[i] == 'L') {
					play[cnt] = play[cnt] + ba + 1;
					ba = 0;
				}
				cnt++;
				if(cnt > n) cnt = 1;
			}
			Arrays.sort(play);
			
			for(int i = 0; i < n; i++) {
				System.out.println(play[i] + " ");
			}
			System.out.println(ba);
		}
	}
}