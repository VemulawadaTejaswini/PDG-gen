import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] dice;
		int[] compare_dice=new int[6];
		int[] int_dice=new int[6];
		int count=0;

		try{

			str=reader.readLine();
			dice=str.split(" ");//{1,2,3,4,5,6}={dice[0], dice[1], ... ,dice[5]}={???, S, E, W, N, ???}
			for(int i=0;i<6;i++){
				int_dice[i]=Integer.parseInt(dice[i]);
			}

			str=reader.readLine();
			dice=str.split(" ");//{1,2,3,4,5,6}={dice[0], dice[1], ... ,dice[5]}={???, S, E, W, N, ???}
			for(int i=0;i<6;i++){
				compare_dice[i]=Integer.parseInt(dice[i]);
			}



			if(int_dice[0]!=compare_dice[0]){
				for(int j=0;j<3;j++){
				 roll('S', int_dice);
				 if(int_dice[0]==compare_dice[0])break;
				}
				if(int_dice[0]!=compare_dice[0]){
					for(int j=0;j<3;j++){
						roll('E', int_dice);
						if(int_dice[0]==compare_dice[0])break;
					}
				}
			}//?????¢????????????????????????


			if(int_dice[1]!=compare_dice[1]){

				for(int k=0;k<3;k++){
					rotate(int_dice);
					if(int_dice[1]==compare_dice[1])break;
				}
			}//?????¢????????????????????????



			for(int i=0;i<6;i++){
				if(int_dice[i]==compare_dice[i]){
					count++;
				}

			}

			if(count==6){System.out.println("Yes");}else{
				System.out.println("No");
			}






		}catch(IOException e){
			System.out.print(e);
		}
	}

	private static void rotate(int[] int_dice){
		//?¨????????????¢???????????????????????????
		int x=int_dice[3];
		int_dice[3]=int_dice[4];
		int_dice[4]=int_dice[2];
		int_dice[2]=int_dice[1];
		int_dice[1]=x;
	}

	private static void roll(char ch, int[] int_dice){
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


	}

}