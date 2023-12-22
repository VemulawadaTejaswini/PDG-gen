import java.util.*;

public class AOJ1104{

    public static void main(String[] args){
	int Walk,x,y,w,h;
	Scanner in = new Scanner(System.in);
	final int[] dx = {0,1,0,-1}; 
	final int[] dy = {1,0,-1,0};
	int dir;
       
	while(true){
	    w = in.nextInt();
	    h = in.nextInt();	       

	    if(w+h == 0)break;
	    dir = 0;
	    x=y=1;
	    while(true){
		String op = in.next();
		if(op.equals("STOP"))break;

		if(op.equals("RIGHT")){
		    ++dir;
		    if(dir == 4)dir = 0;
		}
		else if(op.equals("LEFT")){
		    --dir;
		    if(dir == -1)dir = 3;
		}
		else if(op.equals("FORWARD")){
		    Walk = in.nextInt();
		    x = x + Walk*dx[dir];
		    if(x > w)x = w;
		    if(x <= 0)x=1;
		    y = y + Walk*dy[dir];
		    if(y > h)y = h;
		    if(y <= 0)y=1;
		}
		else if(op.equals("BACKWARD")){
		    Walk = in.nextInt();
		    x = x - Walk*dx[dir];
		    if(x > w)x = w;
		    else if(x < 0)x = 1;
		    y = y - Walk*dy[dir];
		    if(y > h)y = h;
		    else if(y <= 0)y = 1;
		}
	    }
	    System.out.println(x + " " + y);
	}

    }



}