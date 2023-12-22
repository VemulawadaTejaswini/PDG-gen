import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0) break;
			boolean [] year = new boolean[7368793];
			int a = m;
			for(int j=0;j<n;j++) {
				loop:for(int i=a;i<=7368792;i++) {
					if(!year[i]) {
						a = i;
						break loop;
					}
				}
				for(int i=a;i<=7368792;i+=a) {
					year[i] = true;
				}
			}
			long ans = 0;
			loop2:for(int i=m;i<=7368792;i++) {
				if(!year[i]) {
					ans = i;
					break loop2;
				}
			}
			System.out.println(ans);
		}
	}
}
