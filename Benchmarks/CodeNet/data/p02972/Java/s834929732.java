import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i] = in.nextInt();
		}
		boolean[] ans = new boolean[n+1];
		for(int i=n;i>=1;i--) {
			int count = 0;
			int tmp = i*2;
			while(tmp<=n) {
				if(ans[tmp]) count++;
				tmp += i;
			}
			if(count%2!=a[i]) ans[i] = true;
		}
		StringBuilder res = new StringBuilder();
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(ans[i]) {
				res.append(i);
				res.append(" ");
				count++;
			}
		}
		System.out.println(count);
		System.out.println(res.toString());
		
		in.close();

	}

}
