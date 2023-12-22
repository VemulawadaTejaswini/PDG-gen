import java.io.IOException;
import java.util.Scanner;
class Main{
	public static void main(String[] args)throws NumberFormatException, IOException{
//		System.out.println(" ");
		Scanner scan = new Scanner(System.in);
		int decTime =scan.nextInt();
		int diceNum[][] = new int[decTime][6];
		boolean yn = false;
		diceClass dice =new diceClass();

		for (int i=0;i<decTime;i++){
			for (int ii=0;ii<6;ii++){
				diceNum[i][ii] = scan.nextInt();
			}
		}
		int[] diceA =new int[6];
		int[] diceB =new int[6];

		for(int j=0;j<decTime;j++){
			diceA[0] = diceNum[j][0];
			diceA[1] = diceNum[j][1];
			diceA[2] = diceNum[j][2];
			diceA[3] = diceNum[j][3];
			diceA[4] = diceNum[j][4];
			diceA[5] = diceNum[j][5];
			for(int jj=0;jj<decTime;jj++){
				if(j != jj){
					diceB[0] = diceNum[jj][0];
					diceB[1] = diceNum[jj][1];
					diceB[2] = diceNum[jj][2];
					diceB[3] = diceNum[jj][3];
					diceB[4] = diceNum[jj][4];
					diceB[5] = diceNum[jj][5];
				}
////////////////////////////////////////////////////////////////////////////
				for(int i=0;i<4;i++){
					for(int ii=0;ii<4;ii++){
						for(int iii=0;iii<4;iii++){
							yn = dice.compare(diceA, diceB);
							if(yn == true){
								break;
							}
							diceB = dice.move(i);
							yn = dice.compare(diceA, diceB);
							if(yn == true){
								break;
							}
							diceB = dice.move(ii);
							yn = dice.compare(diceA, diceB);
							if(yn == true){
								break;
							}
							diceB = dice.move(iii);
							yn = dice.compare(diceA, diceB);
							if(yn == true){
								break;
							}
						}
						if(yn == true){
							break;
						}
					}
					if(yn == true){
						break;
					}
				}
				if(yn == true){
					break;
				}
////////////////////////////////////////////////////////////////////////////
			}
			if(yn == true){
				break;
			}
		}
		if(yn == true){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}
}

class diceClass{	//?????????????????¢?????????????????´?????????
	int pos[] = new int[6];
	int up0[] = {1,2,4,3};
	int up1[] = {0,3,5,2};
	int up2[] = {0,1,5,4};
	int up3[] = {0,4,5,1};
	int up4[] = {0,2,5,3};
	int up5[] = {1,3,4,2};
	public diceClass(){

	}

	public int[] move(int direction){
		int[] temp = (int[])pos.clone();
		if(direction == 0){
			pos[0] = temp[1];
			pos[1] = temp[5];
			pos[2] = temp[2];
			pos[3] = temp[3];
			pos[4] = temp[0];
			pos[5] = temp[4];
		}
		else if(direction == 1){
			pos[0] = temp[3];
			pos[1] = temp[1];
			pos[2] = temp[0];
			pos[3] = temp[5];
			pos[4] = temp[4];
			pos[5] = temp[2];
		}
		else if(direction == 2){
			pos[0] = temp[2];
			pos[1] = temp[1];
			pos[2] = temp[5];
			pos[3] = temp[0];
			pos[4] = temp[4];
			pos[5] = temp[3];
		}
		else if(direction == 3){
			pos[0] = temp[4];
			pos[1] = temp[0];
			pos[2] = temp[2];
			pos[3] = temp[3];
			pos[4] = temp[5];
			pos[5] = temp[1];
		}
		return pos;
	}



//	public int rightNumber(int up,int ri){
//		int[] temp = new int[4];
//		int front = 0;
////		System.out.println("up "+up+"  "+"front "+ri);
//		if(up == 0){
//			temp = (int[])up0.clone();
//		}
//		else if(up == 1){
//			temp = (int[])up1.clone();
//		}
//		else if(up == 2){
//			temp = (int[])up2.clone();
//		}
//		else if(up == 3){
//			temp = (int[])up3.clone();
//		}
//		else if(up == 4){
//			temp = (int[])up4.clone();
//		}
//		else if(up == 5){
//			temp = (int[])up5.clone();
//		}
//		for(int i =0;i<4;i++){
////			System.out.println("compare "+temp[i]+" "+ri);
//			if(temp[i] == ri){
//				front = i+1;
//				if(front == 4){
//					front = 0;
//				}
//				break;
//			}
//		}
//		return temp[front];
//	}
	public boolean compare(int[] n1,int[] n2){


		if(n1[0] == n2[0] && n1[1] == n2[1] && n1[2] == n2[2]
				&& n1[3] == n2[3] && n1[4] == n2[4] && n1[5] == n2[5]){
			return true;
		}
		else{
			return false;
		}
	}
}