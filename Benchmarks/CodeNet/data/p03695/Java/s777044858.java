
import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int []a = new int [n];
		int []b = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			a[i] = Integer.parseInt(sc.next());
			b[i] = atcoder(a[i]);
		}
		
		int cnt = 0;
		int min = 0;
		int now = 0;
		Arrays.sort(b);
		for(int i = 0 ; i < n ;i++) {
			if(b[i] < 0) {
				cnt++;
			}
			else if(now != b[i]) {
				min++;
				now = b[i];
			}
		}
		
		
		if(cnt == n) {
			System.out.println(1+" "+Math.min(8, cnt));
		}
		else {
			System.out.println(min+" "+(cnt+min));
		}
		
		
	}
	
	static int atcoder(int a) {
		if(a>= 3200) return -1;
		if(a>= 2800) return 8;
		if(a>=2400) return 7;
		if(a>=2000) return 6;
		if(a>=1600) return 5;
		if(a>=1200)return 4;
		if(a>=800) return 3;
		if(a>=400) return 2;
		return 1;
	}

}
