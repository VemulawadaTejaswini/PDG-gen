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
		int queue[]=new int[5000];
		queue[0]=0;
		int head=0,tail=1;
		int count=0;
		int ans[]=new int[N];
		for(int i=0;i<N;i++) {
			ans[i]=-1;
		}
		int pre_count=1;
		int now_count=0;
		while(count<=N-2) {
			boolean is_change=false;
			for(int j=0;j<pre_count;j++) {
			for(int i=1;i<N;i++) {
				if(is_pass[queue[head]][i]&&ans[i]==-1) {
					count++;
					now_count++;
					is_change=true;
					ans[i]=queue[head];
					queue[tail]=i;
					tail=(tail+1)%100000;
				}
			}
			head=(head+1)%100000;
			}
			if(!is_change) {
				System.out.println("No");
				System.exit(0);
			}
			pre_count=now_count;
			now_count=0;
		}
		System.out.println("Yes");
		for(int i=1;i<N;i++) {
			System.out.println(ans[i]+1);
		}


	}
}
