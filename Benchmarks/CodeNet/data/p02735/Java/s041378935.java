import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		Deque<Integer> X=new ArrayDeque<Integer>();
		Deque<Integer> Y=new ArrayDeque<Integer>();
		Deque<Boolean> Key=new ArrayDeque<Boolean>();
		Deque<Integer> Cout=new ArrayDeque<Integer>();
		boolean map[][]=new boolean[H][W];
		boolean visit[][]=new boolean[H][W];
		int min[][]=new int[H][W];
		for(int i=0;i<H;i++){
			String a=stdIn.next();
			for(int j=0;j<W;j++){
				char b=a.charAt(j);
				if(b=='#')
					map[i][j]=true;
			}
		}
		X.add(0);Y.add(0);visit[0][0]=true;
		if(map[0][0]){
			Key.add(true);
			Cout.add(1);
			min[0][0]=1;
		}
		else{
			Cout.add(0);
			Key.add(false);
		}
		while(X.size()>0){
			int x=X.poll();
			int y=Y.poll();
			boolean key=Key.poll();
			boolean ri=false;
			int cout=Cout.poll();
			if(x+1<W){
				if(map[y][x+1]){
					Key.add(true);
					if(key==false){
						cout++;
						ri=true;
					}
				}
				if(map[y][x+1]==false)
					Key.add(false);
				X.add(x+1);Y.add(y);Cout.add(cout);
				if(visit[y][x+1]&&min[y][x+1]>cout)
					min[y][x+1]=cout;
				if(visit[y][x+1]==false){
					min[y][x+1]=cout;
					visit[y][x+1]=true;
				}
			}
			if(ri)
				cout--;
			if(y+1<H){
				if(map[y+1][x]){
					Key.add(true);
					if(key==false){
						cout++;
					}
				}
				if(map[y+1][x]==false)
					Key.add(false);
				X.add(x);Y.add(y+1);Cout.add(cout);
				if(visit[y+1][x]&&min[y+1][x]>cout)
					min[y+1][x]=cout;
				if(visit[y+1][x]==false){
					min[y+1][x]=cout;
					visit[y+1][x]=true;
				}
			}
		}
		System.out.println(min[H-1][W-1]);
	}
}
