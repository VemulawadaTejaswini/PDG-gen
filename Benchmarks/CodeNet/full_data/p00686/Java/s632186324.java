import java.util.*;
public class Main {
	int xpos;
	int ypos;
	int w;
	int h;

	private boolean checkUpper(int pos, String state){
		if(state.equals("y")){
			if(pos > h){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			if(pos > w){
				return false;
			}
			else{
				return true;
			}
		}
	}

	private boolean checkLower(int pos, String state){
		if(state.equals("y")){
			if(pos <= 0){
				return false;
			}
			else{
				return true;
			}
		}
		else{
			if(pos <= 0){
				return false;
			}
			else{
				return true;
			}
		}
	}

	private void operate(int dis, int dir){
		switch(dir){
		case 0:
			if(! checkUpper(ypos+dis, "y")){
				ypos = h;
			}
			else{
				ypos += dis;
			}
			break;

		case 1:
			if(! checkUpper(xpos+dis, "x")){
				xpos = w;
			}
			else{
				xpos += dis;
			}
			break;

		case 2:
			if(! checkLower(ypos-dis, "y")){
				ypos = h;
			}
			else{
				ypos -= dis;
			}
			break;

		case 3:
			if(! checkLower(xpos-dis, "x")){
				xpos = w;
			}
			else{
				xpos -= dis;
			}
			break;
		}
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if(w == 0 && h == 0)
				break;
			int dir = 0;
			xpos = 1;
			ypos = 1;
			int [][] map = new int[w+1][h+1];
			while(true){
				String str = sc.next();
				if(str.equals("STOP")){
					break;
				}
				else if(str.equals("RIGHT")){
					dir = (dir + 1) % 4;
				}
				else if(str.equals("LEFT")){
					dir = (dir + 3) %4;
				}
				else if(str.equals("FORWARD")){
					int dis = sc.nextInt();
					operate(dis, dir);
				}
				else if(str.equals("BACKWARD")){
					int dis = sc.nextInt();
					operate(dis, (dir + 2) % 4);
				}
			}
			System.out.println(xpos + " " + ypos);
		}



	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}