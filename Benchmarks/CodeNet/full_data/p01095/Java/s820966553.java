import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0) break;
			int [] year = new int[7368793];
			for(int i=0;i<=7368792;i++) {
				year[i] = 0;
			}
			int a = 0;
			for(int j=0;j<n;j++) {
				loop:for(int i=m;i<=7368792;i++) {
					if(year[i]!=1) {
						a = i;
						break loop;
					}
				}
				for(int i=a;i<=7368792;i+=a) {
					year[i] = 1;
				}
			}
			int ans = 0;
			loop2:for(int i=m;i<=7368792;i++) {
				if(year[i]!=1) {
					ans = i;
					break loop2;
				}
			}
			System.out.println(ans);
		}
	}
}

