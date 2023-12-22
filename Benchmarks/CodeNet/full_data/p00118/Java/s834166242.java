import java.awt.Point;
import java.util.*;
public class Main {

		
	    public static void main(String[] args) throws java.io.IOException{
	        Scanner scan = new Scanner(System.in);
	       while(true){
	        int h=scan.nextInt();
	        int w=scan.nextInt();
	        scan.nextLine();
	        if((h|w)==0)break;
	        char [][] map =new char[h][w];
	        for(int i=0;i<h;i++){
	        	String tmp =scan.nextLine();
	        	for(int j=0;j<w;j++)map[i][j]=tmp.charAt(j);
	        }
	        
	        Queue <Point> fifo  =new  LinkedList<Point>();
	        int ans=0;
	        for(int m=0;m<h;m++){
	        	for(int n=0;n<w;n++){
	        if(map[m][n]!='.'){
	        	ans++;
	        	Point p = new Point(n,m);
		        fifo.add(p);
	        while(fifo.peek()!=null){
	        	p=fifo.poll();
	        	int x=p.x;
	        	int y=p.y;
	        	char crop = map[y][x];
	        	map[y][x]='.';
	        	int [] dx ={0,1,0,-1};
	        	int [] dy ={1,0,-1,0};
	        	
	        	for(int i=0;i<4;i++){
	        		int nx =x+dx[i];
	        		int ny =y+dy[i];
	        		if(0<=nx&&nx<w&&0<=ny&&ny<h&&map[ny][nx]==crop&&map[ny][nx]!='.'){
	        			Point np = new Point();
	        			np.x=nx;
	        			np.y=ny;
	        			fifo.add(np);
	        			
	        		}
	        	}
	        }
	        }
	        	}
	        }System.out.println(ans);
	       }
	    }
}
	    