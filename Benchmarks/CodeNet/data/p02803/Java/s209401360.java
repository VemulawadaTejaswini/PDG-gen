import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int H=stdIn.nextInt();
		int W=stdIn.nextInt();
		char map[][]=new char[H][W];
		boolean visit[][]=new boolean[H][W];
		Deque<Integer> start=new ArrayDeque<Integer>();
		Deque<Integer> aoki=new ArrayDeque<Integer>();
		int max=0,cout=0;
		for(int i=0;i<H;i++){
			String a=stdIn.next();
			for(int j=0;j<W;j++){
				map[i][j]=a.charAt(j);
				if(map[i][j]=='.'){
					start.add(i);
					start.add(j);
				}
			}
		}
		while(start.size()>0){
			int h=start.poll();
			int w=start.poll();
			aoki.add(h);aoki.add(w);
			visit[h][w]=true;
			while(aoki.size()>0){
				int key=aoki.size();
				for(int i=0;i<key/2;i++){
					h=aoki.poll();w=aoki.poll();
					if(h!=0&&map[h-1][w]=='.'&&visit[h-1][w]==false){
						aoki.add(h-1);aoki.add(w);
						visit[h-1][w]=true;
					}
					if(w!=0&&map[h][w-1]=='.'&&visit[h][w-1]==false){
						aoki.add(h);aoki.add(w-1);
						visit[h][w-1]=true;
					}
					if(h!=H-1&&map[h+1][w]=='.'&&visit[h+1][w]==false){
						aoki.add(h+1);aoki.add(w);
						visit[h+1][w]=true;
					}
					if(w!=W-1&&map[h][w+1]=='.'&&visit[h][w+1]==false){
						aoki.add(h);aoki.add(w+1);
						visit[h][w+1]=true;
					}
				}
				cout++;
			}cout--;
			if(cout>max)
				max=cout;
			cout=0;
			visit=new boolean[H][W];
		}
		System.out.println(max);
	}
}
