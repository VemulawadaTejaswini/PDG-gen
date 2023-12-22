
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
				
		System.out.println(dice.SurfaceNum[dice.topIndex-1]);
	}
	

}


class Dice {
	int SurfaceNum[]=new int[6];
	
	int neighber[][]= {{2,5,4,3},{6,1,4,3,},{2,5,1,6},{2,5,6,1},{1,6,4,3},{5,2,4,3}};
	
	int topIndex=1,i=0;
	
	void rotateDice(char odr) {
		if(odr=='N')topIndex=neighber[topIndex-1][0];
		else if(odr=='S')topIndex=neighber[topIndex-1][1];
		else if(odr=='E')topIndex=neighber[topIndex-1][2];
		else if(odr=='W')topIndex=neighber[topIndex-1][3];
	}
	

}
