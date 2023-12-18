import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if(N < 357) {
			System.out.println("0");
			return;
		}
		int[] n = new int[10];
		n[0] = 3;
		n[1] = 2;
		n[2] = 1;
		
		int ans = 0;
		while(true) {
			long num = 0;
			boolean flag7 = false, flag5 = false, flag3 = false;
			for(int i = 0;i < n.length;++i) {
				if(n[i] == 3) {
					num += 7 * (long)Math.pow(10, i);
					flag7 = true;
				}else if(n[i] == 2) {
					num += 5 * (long)Math.pow(10, i);
					flag5 = true;
				}else if(n[i] == 1) {
					num += 3 * (long)Math.pow(10, i);
					flag3 = true;
				}
			}
			if(num <= N) {
				if(flag7 && flag5 && flag3)
					ans++;
			} else {
				break;
			}
			n[0]++;
			for(int i = 0;i < n.length-1;++i) {
				if(n[i] >= 4) {
					n[i] = 1;
					n[i+1]++;
				}
			}
		}
		System.out.println(ans);
	}
}
