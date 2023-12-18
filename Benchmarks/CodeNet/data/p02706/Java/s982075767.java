import java.util.Scanner;

class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cse = 1;
//		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
//		while(t-->0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[] = new int[m];
			int sum=0;
			for(int i=0;i<m;i++) {
				a[i] = sc.nextInt();
				sum+=a[i];
			}
			if(sum<=n)
				sb.append(n-sum);
			else
				sb.append("-1");
			sb.append("\n");
			cse++;
//		}
		System.out.print(sb.toString());
	}
}