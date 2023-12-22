import java.util.Random;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] d = new int[6];

		Dice dice=new Dice();//クラスDiceを定義

		for (int i = 0; i < 6; i++) {
			d[i] = scanner.nextInt();
			dice.num[i]=d[i];//Diceクラスの変数numに代入
		}

		int q = scanner.nextInt();

		for(int i=0;i<q;i++){
			int head =scanner.nextInt();
			int flont=scanner.nextInt();
		
			dice.Roll(head,flont);
			
			System.out.println(dice.num[2]);
			
		}
		

		scanner.close();
	}
}


class Dice {
	Random rand = new Random();
	int num [];
	Dice(){
		num= new int[6];
	}
	
	int box=0;

	public void Roll(int head,int flont) {
	
		while(true){
			
			if((head == num[0])&&(flont == num[1])){
				break;
				}
			
		 int random = rand.nextInt(4); 
			switch(random){//配列の各数字をサイコロの展開図に見立て動きを再現

			case 0:

				box=num[0];
				num[0]=num[4];
				num[4]=num[5];
				num[5]=num[1];
				num[1]=box;


				break;

			case 1 :

				box=num[0];
				num[0]=num[1];
				num[1]=num[5];
				num[5]=num[4];
				num[4]=box;


				break;

			case 2 :

				box=num[0];
				num[0]=num[2];
				num[2]=num[5];
				num[5]=num[3];
				num[3]=box;


				break;

			case 3:


				box=num[0];
				num[0]=num[3];
				num[3]=num[5];
				num[5]=num[2];
				num[2]=box;


				break;

			}
			

		}
	}}


