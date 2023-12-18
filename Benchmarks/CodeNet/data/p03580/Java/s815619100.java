import java.util.*;
//atCoder用
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c[] = new int[n];
		Arrays.fill(c, 0);
		String s = sc.next();
		for (int i=0; i<n; i++) {
			if (s.charAt(i)=='1') {
				c[i] = 1;
			}
		}
		int ans=0;
		if (n>=3) {
		for (int i=0; i<n/2-1; i++) {
			if (c[n-(i+1)]==1 && c[n-(i+2)]==0 && c[n-(i+3)]==1) {
				c[n-(i+1)]=0;
				c[n-(i+2)]=1;
				c[n-(i+3)]=0;
				ans++;
				i=0;
				for (int x=0; x<n; x++) {
					System.out.print(c[x]);
				}
				System.out.println();
			}
			if (c[i]==1 && c[i+1]==0 && c[i+2]==1) {
				c[i]=0;
				c[i+1]=1;
				c[i+2]=0;
				ans++;
				i=0;
				
				for (int x=0; x<n; x++) {
					System.out.print(c[x]);
				}
				System.out.println();
			}
		}}
		System.out.println(ans);
	}
}