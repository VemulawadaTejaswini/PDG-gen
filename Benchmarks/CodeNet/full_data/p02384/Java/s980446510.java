import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
		Scanner scan = new Scanner(System.in);
		int num[] = new int[6];
		int answer = 0;
		int decTime = 0;
		int frontAddress = 0;
		diceClass dice =new diceClass();
		for (int i=0;i<6;i++){
			num[i] = scan.nextInt();
			dice.pos[i] = num[i];
		}
		decTime = scan.nextInt();
		int upSide[] = new int[decTime];
		int frontSide[] = new int[decTime];
		for(int i=0;i<decTime;i++){
			upSide[i] = scan.nextInt();
			frontSide[i] = scan.nextInt();
			for(int ii=0;ii<6;ii++){
				if(frontSide[i] == num[ii]){
					frontAddress = ii;
				}
			}
			for(int ii=0;ii<6;ii++){
				if(upSide[i] == num[ii]){
					answer = dice.rightNumber(ii,frontAddress);
					System.out.println(num[answer]);
				}
			}
		}
	}
}
class diceClass{	
	int pos[] = new int[6];
	int up0[] = {1,2,4,3};
	int up1[] = {0,3,5,2};
	int up2[] = {0,1,5,4};
	int up3[] = {0,4,5,1};
	int up4[] = {0,2,5,3};
	int up5[] = {1,3,4,2};
	public diceClass(){

	}

	public int rightNumber(int up,int ri){
		int[] temp = new int[4];
		int front = 0;
		if(up == 0){
			temp = (int[])up0.clone();
		}
		else if(up == 1){
			temp = (int[])up1.clone();
		}
		else if(up == 2){
			temp = (int[])up2.clone();
		}
		else if(up == 3){
			temp = (int[])up3.clone();
		}
		else if(up == 4){
			temp = (int[])up4.clone();
		}
		else if(up == 5){
			temp = (int[])up5.clone();
		}
		for(int i =0;i<4;i++){
			if(temp[i] == ri){
				front = i+1;
				if(front == 4){
					front = 0;
				}
				break;
			}
		}
		return temp[front];
	}
}