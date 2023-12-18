import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int li[] = new int[n];
        for (int i = 0; i < n; i++) {
			 li[i] = sc.nextInt();
        }
        System.out.println(li[1]);
        boolean h = true;
		int cnt = 0;
		while (h) {
			for (int k = 0; k < n; k++) {
				if (li[k] % 2 != 0) {
					h = false;
					break;
				} else if (k == n-1) {
                    cnt++;
                }
                li[k] = li[k]/2;
			}
		}
		System.out.println(cnt);
		//sc.close();

    }
}