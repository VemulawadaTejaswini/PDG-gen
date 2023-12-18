import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = 1, m = 0;
		StringBuilder sb = new StringBuilder();
		while((1<<n-1)-1<l) n++;
		n--;
		for (int i = 1; i < n; i++) {
			sb.append(Convert(i,i+1,0));
			sb.append(Convert(i,i+1,1<<i-1));
			m += 2;
		}
		int max = (1<<n-1)-1;
		while(l-max>1) {
			int k = 1;
			while((1<<k-1)<l-max) k++;
			k--;
			sb.append(Convert(k, n, max+1));
			m++;
			max += (1<<k-1);
		}
		System.out.printf("%d %d\n",n,m);
		System.out.println(new String(sb));
		sc.close();
	}
	public static String Convert(int a, int b, int c) {
		return String.valueOf(a)+' '+String.valueOf(b)+' '+String.valueOf(c)+"\n";
	}
}