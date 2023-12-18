import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] pnums = new int[n];


		int cnt = 0;
		int num = 2;

		while(true) {
			boolean addflg = true;
			for(int i = 0; i < cnt; i++) {
				if( (num % pnums[i]) == 0 ) {
					addflg = false;
					num++;
					break;
				}
			}
			if(addflg == false)
				continue;

			pnums[cnt] = num;
			cnt++;
			num++;

			if(cnt == n)
				break;
		}

		for(int i = 0; i < n; i++) {
			if(i != 0)
				System.out.print(" ");
			System.out.print(pnums[i]);
		}
		System.out.print("\n");
	}
}
