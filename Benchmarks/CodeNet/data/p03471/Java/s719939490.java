import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int y = in.nextInt();
		boolean aohashi = false;
		int[] ans = new int[3];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n-i;j++) {
				int k = n-i-j;
				int sum = i*1000 + j*5000 + k*10000;
				if(y==sum) {
					aohashi = true;
					ans[0] = i;
					ans[1] = j;
					ans[2] = k;
					break;
				}
			}
			if(aohashi) break;
		}
		
		if(aohashi) System.out.println(ans[2]+" "+ans[1]+" "+ans[0]);
		else System.out.println("-1 -1 -1");
		in.close();

	}

}
