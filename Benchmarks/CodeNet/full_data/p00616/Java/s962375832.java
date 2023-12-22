import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ1030().doIt();
	}
	
	class AOJ1030{
		void doIt(){
			int h = in.nextInt();
			int n = in.nextInt();
			if(h+n==0)return;
			boolean[][][] ball = new boolean[h][h][h];
			for(int i=0;i<h;i++)for(int s=0;s<h;s++)Arrays.fill(ball[i][s],true);
			for(int i=0;i<n;i++){
				String input = in.next();
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				if(input.equals("xy"))for(int s=0;s<h;s++)ball[a][b][s]=false;
				else if(input.equals("yz"))for(int s=0;s<h;s++)ball[s][a][b]=false;
				else if(input.equals("xz"))for(int s=0;s<h;s++)ball[a][s][b]=false;
			}
			int cnt = 0;
			for(int i=0;i<h;i++)for(int s=0;s<h;s++)for(int k=0;k<h;k++)if(ball[i][s][k])cnt++;
			System.out.println(cnt);
		}
	}
	
}