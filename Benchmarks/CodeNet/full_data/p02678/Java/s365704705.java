import java.util.Scanner;
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		boolean is_pass[][]=new boolean[N][N];
		for(int i=0;i<M;i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			is_pass[A-1][B-1]=true;
			is_pass[B-1][A-1]=true;
		}
		if(M<N) {
			System.out.println("No");
			System.exit(0);
		}
		int ans[]=new int[N];
		for(int i=1;i<N;i++) {
			if(is_pass[0][i]) {
				ans[i]=1;
			}
		}




		boolean flag=true;

		for(int count=1;;count++) {
			for(int j=1;j<N;j++) {
				if(ans[j]==count) {
					for(int i=1;i<N;i++) {
						if(is_pass[j][i]&&ans[i]==0) {
							ans[i]=j+1;
						}
					}
				}

				}
			for(int j=1;j<N;j++) {
				if(ans[j]==0) {
					flag=false;
					break;
				}
			}
			if(flag)
				break;
		}
		if(flag) {
			System.out.println("Yes");
			for(int i=1;i<N;i++)
				System.out.println(ans[i]);
		}
	}
}
