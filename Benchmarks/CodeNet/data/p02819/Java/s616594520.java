import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] prime = new int[101000];
		boolean[] isp = new boolean[101000];
		int x = sc.nextInt();
		for (int i = 0; i < isp.length; i++) {
			isp[i] = true;
		}
		int p = 0;
		isp[0] = false; isp[1] = false;
		for (int i = 2; i < 101000; i++) {
			if(isp[i]) {
				prime[p] = i;
				p++;
				for(int j = 2*i;j < 101000; j += i) {
					isp[j] = false;
				}
			}
		}
		int i = 0;
		while(true) {
			if(prime[i] >= x) {
				System.out.println(prime[i]);
				break;
			}
			i++;
		}
		sc.close();
	}
}