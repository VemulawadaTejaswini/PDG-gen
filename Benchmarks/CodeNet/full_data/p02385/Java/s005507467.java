import java.util.Scanner;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] d = new int[6];

		Dice dice=new Dice();//さいころ１

		Dice dice2=new Dice();//さいころ２

		String anther="No"

				;
		for (int i = 0; i < 6; i++) {
			d[i] = scanner.nextInt();
			dice.num[i]=d[i];//さいころ１に目を入れる
		}


		for (int i = 0; i < 6; i++) {
			d[i] = scanner.nextInt();
			dice2.num[i]=d[i];//さいころ２に目を入れる
		}


		for(int i =0; i<4;i++){
			dice.Roll("S");  //水平軸に一回転
			for(int k =0;k<4;k++){
				dice.Roll("W");  //垂直軸に一回転
				for(int p=0;p<4;p++){
					dice.Roll("R"); //縦軸に一回転
					if(Arrays.equals(dice.num,dice2.num)){
						anther="Yes";
					}
				}
			}

		}
		System.out.println(	anther);



		scanner.close();
	}
}


class Dice {

	int num [];
	Dice(){
		num= new int[6];
	}

	int box=0;



	public void Roll(String order) {


		switch(order){//配列の各数字をサイコロの展開図に見立て動きを再現

		case "S" :

			box=num[0];
			num[0]=num[4];
			num[4]=num[5];
			num[5]=num[1];
			num[1]=box;


			break;

		case "N" :

			box=num[0];
			num[0]=num[1];
			num[1]=num[5];
			num[5]=num[4];
			num[4]=box;


			break;

		case "W" :

			box=num[0];
			num[0]=num[2];
			num[2]=num[5];
			num[5]=num[3];
			num[3]=box;


			break;

		case "E":


			box=num[0];
			num[0]=num[3];
			num[3]=num[5];
			num[5]=num[2];
			num[2]=box;


			break;

		case "R"://サイコロを縦軸で回転させる
			box=num[1];
			num[1]=num[2];
			num[2]=num[4];
			num[4]=num[3];
			num[3]=box;



		}


	}




}




