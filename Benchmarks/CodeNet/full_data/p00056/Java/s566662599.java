import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] p = new boolean[50001];
		p[0] = false;
		p[1] = false;
		for(int i=2;i<=50000;i++) {
			p[i] = true;
		}
		for(int i=2;i<=Math.sqrt(50000);i++) {
			if(p[i] == true) {
				for(int j=i*2;j<=50000;j+=i) {
					p[j] = false;
				}
			}
		}
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int count = 0;
			for(int i=2;i<=n/2;i++) {
				if(p[i] == true && p[n-i] == true) {
					count++;
//					System.out.println(i + " " + (n-i));
				}
			}
			System.out.println(count);
		}
	}
}



