import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),s=0,buff=-1;
		int[] c = new int[5];
		for(int i=0;i<5;i++) {
			c[i]=-1;
		}
		int[] a=new int[n];
		for(int i=0;i<m;i++) {
			s=sc.nextInt();
			buff=sc.nextInt();
			if(c[s-1]!=-1&&c[s-1]!=buff) {
				System.out.println(-1);
				System.exit(0);
			}
			c[s-1]=buff;
			a[s-1]++;
		}
		StringBuilder res= new StringBuilder();
		if(c[0]==0) {
			System.out.println(-1);
			System.exit(0);
		}
		for(int i=0;i<n;i++) {
			if(c[i]==-1&&i==0) {
				res.append("1");
			}else if(c[i]==-1) {
				res.append(0);
			}else {
				res.append(c[i]);
			}
		}
		System.out.println(res.toString());
	}
}

