import java.util.Scanner;

class Bot{
	int x = 1, y = 1 , dir = 0;
	private int width, height;
	
	private int[][] xy = {
			{0,1},{1,0},{0,-1},{-1,0}
	};
	
	public Bot(int w, int h) {
		width = w;
		height = h;
	}
	
	
	public void  forward(int step){
		x += xy[dir][0]*step;
		y += xy[dir][1]*step;
		beProperly();
	}
	
	public void backward(int step){
		x -= xy[dir][0]*step;
		y -= xy[dir][1]*step;
	}
	
	public void right(){
		dir = (dir+1)%4;
	}
	
	public void left(){
		if(--dir == -1) dir = 3;
	}
	
	private void beProperly(){
		if(x > width) x = width;
		if(y > height) y = height;
		if(x < 1) x = 1;
		if(y < 1) y = 1;
	}
}


public class Main {
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);

		while(true){
			int w = sn.nextInt(), h = sn.nextInt();
			if(w == 0 && h == 0) break;
			Bot bot = new Bot(w, h);
			while(true){

				String cmd = sn.nextLine();
				String[] go = cmd.split(" ");
				String dir;
				
				if(go.length == 2){
					int step = new Integer(go[1]);
					if(go[0].equals("FORWARD")) bot.forward(step);
					else if(go[0].equals("BACKWARD")) bot.backward(step);
				} else{
					
					if(go[0].equals("RIGHT")) bot.right();
					else if(go[0].equals("LEFT")) bot.left();
					else if(go[0].equals("STOP")) break;
				}
			}
			System.out.println(bot.x+" "+bot.y);
		}		
	}
}