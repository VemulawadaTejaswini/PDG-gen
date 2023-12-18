import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		char c[]=S.toCharArray();
		char d[]=c.clone();
		int N=c.length;
		int x[]=new int[N+1];
		int j=0;
		int count=0;
		for(int i=0;i<N;i++) {
			if(c[i]!='x') {
				d[j]=c[i];
				j++;
			}
			else {
				x[j]++;
			}
		}
		for(int i=0;i<=(j-1)/2;i++) {
			if(d[i]!=d[j-1-i]) {
				System.out.println(-1);
				return;
			}
		}
		for(int i=0;i<=j/2;i++) {
			count+=Math.abs(x[i]-x[j-i]);
		}
		System.out.println(count);
		
	}
}
