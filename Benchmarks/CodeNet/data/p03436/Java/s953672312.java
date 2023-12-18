import java.awt.Point;
import java.util.ArrayDeque;
import java.util.Scanner;
 
public class Main{
	
	static final Scanner s=new Scanner(System.in);
	
	
	static final int[]
			dx={0,1,0,-1},
			dy={-1,0,1,0};
	
	public static void main(String[]args){
		int r=s.nextInt(),c=s.nextInt();
		Point start=new Point(0,0);
		Point goal =new Point(r-1,c-1);
		
		char[][] f=new char[r][];
		for(int i=0;i<r;i++) f[i]=s.next().toCharArray();
		
		ArrayDeque<Point> deque=new ArrayDeque<>();
		deque.add(start);
		
        int count=0;
        int siro=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(f[i][j]=='.'){
                    siro++;

                }
            }
        }
        boolean yey=true;
		outer:
		for(;true;count++){
			for(int i=deque.size();i>0;i--) {
				Point poll=deque.poll();
				if(poll.equals(goal)) {
					break outer;
				}
				for(int j=0;j<4;j++) {
                    if((poll.x+dx[j]>=0)&&(poll.x+dx[j]<r)&&(poll.y+dy[j]>=0)&&(poll.y+dy[j]<c)){
					if(f[poll.x+dx[j]][poll.y+dy[j]]=='.') {
						f[poll.x+dx[j]][poll.y+dy[j]]='#';
						deque.add(new Point(poll.x+dx[j],poll.y+dy[j]));
						
						//for(char[]ch:f)System.out.println(Arrays.toString(ch));
					}}
                }
                if(deque.size()==0){
                    yey=false;
                    System.out.println(-1);
                    break outer;
                }
			}
        }
        if(yey){
        System.out.println(siro-1-count);}
		
	}
}
