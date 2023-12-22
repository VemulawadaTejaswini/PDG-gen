import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dice{
	String[] dice_str;
	int[] dice=new int[6];


	Dice(String str){//dice?????????????????????
		dice_str=str.split(" ");
        for(int i=0;i<6;i++){
            this.dice[i]=Integer.parseInt(dice_str[i]);
        }
	}

	public static void rotate(int[] int_dice){
	    //?¨????????????¢???????????????????????????
	    int x=int_dice[3];
	    int_dice[3]=int_dice[4];
	    int_dice[4]=int_dice[2];
	    int_dice[2]=int_dice[1];
	    int_dice[1]=x;
	}

	public static void roll(char ch, int[] int_dice){
	    int[] dice_for_change=new int[6];

	    switch(ch){

	    case 'S':
	    {
	        dice_for_change[0]=int_dice[4];
	        dice_for_change[1]=int_dice[0];
	        dice_for_change[2]=int_dice[2];
	        dice_for_change[3]=int_dice[3];
	        dice_for_change[4]=int_dice[5];
	        dice_for_change[5]=int_dice[1];

	        }
	    break;

	    case 'E':
	    {
	        dice_for_change[0]=int_dice[3];
	        dice_for_change[1]=int_dice[1];
	        dice_for_change[2]=int_dice[0];
	        dice_for_change[3]=int_dice[5];
	        dice_for_change[4]=int_dice[4];
	        dice_for_change[5]=int_dice[2];

	        }
	    break;
	    case 'N':
	    {//??????
	        dice_for_change[0]=int_dice[1];
	        dice_for_change[1]=int_dice[5];
	        dice_for_change[2]=int_dice[2];
	        dice_for_change[3]=int_dice[3];
	        dice_for_change[4]=int_dice[0];
	        dice_for_change[5]=int_dice[4];
	        }
	    break;

	    case 'W':
	    {
	        dice_for_change[0]=int_dice[2];
	        dice_for_change[1]=int_dice[1];
	        dice_for_change[2]=int_dice[5];
	        dice_for_change[3]=int_dice[0];
	        dice_for_change[4]=int_dice[4];
	        dice_for_change[5]=int_dice[3];
	        }
	    break;
	    }//switch
	    for(int k=0;k<6;k++){
	        int_dice[k]=dice_for_change[k];

	    }//??¢?????????????????£??\
	 }//switch

	public static int isDicesMatch(int dice1[], int dice2[]){

		int count;

		for(int i=0;i<4;i++){
			roll('S', dice1);

			for(int j=0;j<4;j++){
				rotate(dice1);

				count=0;
				for(int k=0;k<6;k++){
					if(dice1[k]!=dice2[k])break;
					else{count++;
					}
					if(count==6)return 1;

				}

			}//????????????????????¢


        }//?????????????????¢????¢????

        for(int i=0;i<4;i++){

			roll('E', dice1);

			for(int j=0;j<4;j++){
				rotate(dice1);

				count=0;
				for(int k=0;k<6;k++){
					if(dice1[k]!=dice2[k])break;
					else{count++;
					}
					if(count==6)return 1;

				}

			}//????????????????????¢


        }//?¨???????????????¢????¢????


		return -1;
	}



}


class Main{

	public static void main(String[] args){

BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    String str;
    int result=0;
    int num;

    try{

    	num=Integer.parseInt(reader.readLine());
    	Dice[] dice=new Dice[num];
    	for(int i=0;i<num;i++){
        str=reader.readLine();
        dice[i]=new Dice(str);
    	}

    	for(int i=0;i<num-1;i++){

    		for(int j=i+1;j<num;j++){

        		result=Dice.isDicesMatch(dice[i].dice, dice[j].dice);
        		if(result==1)break;
    		}if(result==1)break;
    	}

    	if(result==1){
    		System.out.println("No");
    	}else{
    		System.out.println("Yes");
    	}

    }catch(IOException e){
        System.out.print(e);
    }
}

}