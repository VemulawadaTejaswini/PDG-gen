import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		boolean visit[]=new boolean[N];
		int ball[]=new int[N];
		int ans=0;
		visit[0]=true;
		for(int i=0;i<N;i++){
			ball[i]=1;
		}
		for(int i=0;i<M;i++){
			int x=stdIn.nextInt()-1;
			int y=stdIn.nextInt()-1;
			if(visit[x]){
				visit[y]=true;
				ball[y]++;
				ball[x]--;
			}
			if(ball[x]==0){
				visit[x]=false;
			}
		}
		for(int i=0;i<N;i++){
			if(visit[i])
				ans++;
		}
		System.out.println(ans);
	}
}
