
import java.util.*;

class Main {
	 
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		
		Dice dice=new Dice();
		
		for(int i=0;i<6;i++) {
			dice.SurfaceNum[i]=cin.nextInt();
		}
		
		String str=cin.next();
		char Oder[]=str.toCharArray();
		
		for(int i=0;i<Oder.length;i++)dice.rotateDice(Oder[i]);
				
		System.out.println(dice.SurfaceNum[dice.gridX[0]-1]);
	}
	

}


class Dice {
	int SurfaceNum[]=new int[6];
	
	int gridX[]= {1,3,6,4},gridY[]= {1,5,6,2};
	
	int temp=1,i=0;
	
	void rotateDice(char odr) {
		if(odr=='N') {
			temp=gridY[3];
			System.arraycopy(gridY, 0, gridY, 1, gridY.length-1);
			gridY[0]=temp;
			gridX[0]=gridY[0];
			gridX[2]=gridY[2];
		}
		else if(odr=='S') {
			temp=gridY[0];
			System.arraycopy(gridY, 1, gridY, 0, gridY.length-1);
			gridY[3]=temp;
			gridX[0]=gridY[0];
			gridX[2]=gridY[2];
		}
		else if(odr=='E') {
			temp=gridX[3];
			System.arraycopy(gridX, 0, gridX, 1, gridX.length-1);
			gridX[0]=temp;
			gridY[0]=gridX[0];
			gridY[2]=gridX[2];
		}
		else if(odr=='W') {
			temp=gridX[0];
			System.arraycopy(gridX, 1, gridX, 0, gridX.length-1);
			gridX[3]=temp;
			gridY[0]=gridX[0];
			gridY[2]=gridX[2];
		}
	}
	

}
