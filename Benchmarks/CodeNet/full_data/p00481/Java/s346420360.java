import java.util.*;
import java.math.*;
import java.io.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.lang.System.*;

public class Main {
	Scanner cin;
	class State{
		int time,x,y;
		State(int time,int x,int y){
			this.time=time;
			this.x=x;
			this.y=y;
		}
	}
	void run(){
		cin=new Scanner(System.in);
		int H=cin.nextInt(),W=cin.nextInt(),N=cin.nextInt();
		String[] MAP=new String[H];
		int []dx={1,0,-1,0},dy={0,1,0,-1};
		int result=0;
		for(int i=0;i<H;i++)MAP[i]=cin.next().replaceAll("S","0");
		for(int i=0;i<N;i++){
			int sx=-1,sy=-1;
			Queue<State> que=new LinkedList<State>();
			Boolean[][] visited=new Boolean[H][W];
			for(int p=0;p<H;p++){
				for(int q=0;q<W;q++){
					visited[p][q]=false;
					if(MAP[p].charAt(q)==i+'0'){
						sx=q;sy=p;
					}	
				}	
			}	
			que.add(new State(0,sx,sy));
			while(!que.isEmpty()){
				State now=que.poll();
				if(MAP[now.y].charAt(now.x)==i+1+'0'){
					result+=now.time;
					break;
				}
				for(int k=0;k<4;k++){
					int nx=now.x+dx[k],ny=now.y+dy[k];
					if(nx>=0&&nx<W&&ny>=0&&ny<H){
						if(visited[ny][nx]==false&&MAP[ny].charAt(nx)!='X'){
							visited[ny][nx]=true;
							que.add(new State(now.time+1,nx,ny));
						}
					}
				}
			}
		}
		printf("%d\n",result);
	}

	void printf(String format,Object... args){
		System.out.printf(format, args);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}