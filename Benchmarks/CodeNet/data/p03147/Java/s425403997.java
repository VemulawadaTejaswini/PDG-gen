import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] h = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = scn.nextInt();
		}
		boolean cont = true;
		int ans = 0;
		while (cont) {
			boolean ren = false;
			for (int i = 0; i < h.length; i++) {
				if (i == h.length - 1) {
					if (h[i] == 0) {
						if (ren) {
							ans++;
							ren = false;
						}
					} else {
						ren = true;
						h[i]--;
						ans++;
					}
				} else {
					if (h[i] == 0) {
						if (ren) {
							ans++;
							ren = false;
						}
					} else {
						ren = true;
						h[i]--;
					}
				}
			}
			cont = false;
			for(int i = 0;i < h.length;i++) {
				cont |= !(h[i]==0);
			}
		}
		System.out.println(ans);
	}

}
