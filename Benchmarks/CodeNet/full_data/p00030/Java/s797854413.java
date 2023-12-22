import java.util.Scanner;

public class Main{
	static int[] bit = new int[10];
	static int[][] cnt = new int[11][101];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		rec(0);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			if(n == 0 && s == 0) {
				break;
			}
			System.out.println(cnt[n][s]);
		}
		sc.close();

	}
	static void add() {
		int sum =  0;
		int m = 0;
		for(int i = 0; i < bit.length; i++) {
			if(bit[i] == 1) {
				sum += i;
				m++;
			}
		}
		if(m != 0) {
			cnt[m][sum]++;
		}
	}
	static void rec(int k) {
        if(k == bit.length) {
        	add();
            return;
        }
        rec(k + 1);
        bit[k] = 1;
        rec(k + 1);
        bit[k] = 0;
    }
}
