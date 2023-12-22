import java.util.*;
class Main{
    int dx[]={-1,0,1,0};
    int dy[]={0,-1,0,+1};//x,y,sys
    void run(){
	Scanner sc=new Scanner(System.in);
	while(true){
	    int N=sc.nextInt();
	    if(N==0)break;
	    P.init();
	    P[] p=new P[N];
	    p[0]=new P(0,0);
	    for(int i=1;i<N;i++){
		int n=sc.nextInt();
		int d=sc.nextInt();
		p[i]=new P(p[n].x+dx[d],p[n].y+dy[d]);
		
	    }
	    System.out.println(P.getX()+" "+P.getY());
	}
    }
    public static void main(String[] args){
	new Main().run();
    }
}

class P{
    static int maxX,maxY,minX,minY;
    int x,y;
    P(int x,int y){
	this.x=x;this.y=y;
	maxX=Math.max(maxX,x);
	maxY=Math.max(maxY,y);
	minX=Math.min(minX,x);
	minY=Math.min(minX,y);
    }
    static void init(){
	maxX=0;maxY=0;minX=0;minY=0;
    }
    static int getX(){
	return (maxX-minX+1);
    }
    static int getY(){
	return (maxY-minY+1);
    }
}