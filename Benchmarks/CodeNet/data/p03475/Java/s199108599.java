import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}



	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c[]=new int[n];
		int s[]=new int[n];
		int f[]=new int[n];
		for(int i=0; i<n-1; i++) {
			c[i]=sc.nextInt();
			s[i]=sc.nextInt();
			f[i]=sc.nextInt();
		}
		int cnt[] = new int[n];
		for(int i=0; i<n-1; i++) {
			for(int j=i; j<n-1; j++) {
				if(cnt[i]<s[j]) {
					cnt[i]=s[j];
				}
				cnt[i]+=(cnt[i]%f[j]+f[j])%f[j];
				cnt[i]+=c[j];
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(cnt[i]);
		}
		sc.close();
	}

}
