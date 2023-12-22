import java.util.*;

public class Main{

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
	    x=1;
	    y=1;
	    while(true){
		//String[] op = in.next().split(" ");
		String op = in.next();
		//if(op[0].equals("STOP"))break;
		if(op.equals("STOP"))break;

		//if(op[0].equals("RIGHT")){
		if(op.equals("RIGHT")){
		    dir++;
		    if(dir == 4)dir = 0;
		}
		else if(op.equals("LEFT")){
		//else if(op[0].equals("LEFT")){
		    dir--;
		    if(dir == -1)dir = 3;
		}
		else if(op.equals("FORWARD")){
		//else if(op[0].equals("FORWARD")){
		    // Walk = Integer.parseInt(op[1]); 
		    Walk = in.nextInt();
		    x = x + Walk*dx[dir];
		    if(x > w)x = w;
		    y = y + Walk*dy[dir];
		    if(y > h)y = h;
		}
		else if(op.equals("BACKWARD")){
		//else if(op[0].equals("BACKWARD")){
		    // Walk = Integer.parseInt(op[1]);
		    Walk = in.nextInt();
		    x = x - Walk*dx[dir];
		    if(x > w)x = w;
		    y = y - Walk*dy[dir];
		    if(y > y)y = h;
		}
	    }
	    System.out.println(x + " " + y);
	}

    }







}