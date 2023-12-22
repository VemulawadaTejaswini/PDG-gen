import java.util.Scanner;
import java.util.Arrays;

class Main{
       public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	Dice dice1 = new Dice();
    	Dice dice2 = new Dice();
    	for(int i = 0; i < 6; i++){
    		dice1.inputSurface(i , scan.nextInt());
    	}
    	for(int i = 0; i < 6; i++){
    		dice2.inputSurface(i , scan.nextInt());
    	}
    	
    	int top = dice2.getSurface(0);
    	int front = dice2.getSurface(1);
    	int i;
    	
    	for(i = 0; i < 6; i++){
    		if(dice1.getSurface(i) == top){
    			dice1.setTop(top);
    			
    			for(i = 1; i < 5; i++){
    				if(dice1.getSurface(i) == front){
    					dice1.setFront(front);
    					if(Arrays.equals(dice1.getSurfaceAll(), dice2.getSurfaceAll())){
    						System.out.println("Yes");
    						return;
    					}
    				}
    			}
    			break;
    		}
    	}
    	System.out.println("No");
     }
}

/*
????????????:Dice
?????? ?????????????????¢?????????????????????
	 ?????¢???????????????
*/
class Dice{
	private int[] surface = new int[6];
	
	public void inputSurface(int c, int x){
		surface[c] = x;
	}
	
	public void spin(char order){
		int buf;
		//???????????????????????¢?????£????????????surface?????\????????????
		switch(order){
			case 'N':{
				buf = surface[0];
				surface[0] = surface[1];
				surface[1] = surface[5];
				surface[5] = surface[4];
				surface[4] = buf;
				break;
			}
			case 'E':{
    			buf = surface[0];
    			surface[0] = surface[3];
    			surface[3] = surface[5];
    			surface[5] = surface[2];
    			surface[2] = buf;
    			break;
			}
			case 'W':{
				buf = surface[0];
    			surface[0] = surface[2];
    			surface[2] = surface[5];
    			surface[5] = surface[3];
    			surface[3] = buf;
    			break;
			}
			case 'S':{
				buf = surface[0];
    			surface[0] = surface[4];
    			surface[4] = surface[5];
    			surface[5] = surface[1];
    			surface[1] = buf;
    			break;
			}
		}
	}
	
	public void setTop(int top){
		if(top == surface[1]){
			this.spin('N');
		}else if(top == surface[2]){
			this.spin('W');
		}else if(top == surface[3]){
			this.spin('E');
		}else if(top == surface[4]){
			this.spin('S');
		}else if(top == surface[5]){
			this.spin('N');
			this.spin('N');
		}
	}
	
	public void setFront(int front){
		int temp;
		if(front == surface[2]){
			temp = surface[1];
			surface[1] = surface[2];
			surface[2] = surface[4];
			surface[4] = surface[3];
			surface[3] = temp;
		}else if(front == surface[3]){
			temp = surface[1];
			surface[1] = surface[3];
			surface[3] = surface[4];
			surface[4] = surface[2];
			surface[2] = temp;
		}else if(front == surface[4]){
			temp = surface[1];
			surface[1] = surface[4];
			surface[4] = temp;
			temp = surface[2];
			surface[2] = surface[3];
			surface[3] = temp;
		}
	}
	
	public int getSurface(int num){
		return surface[num];
	}
	
	public int[] getSurfaceAll(){
		return surface;
	}
}