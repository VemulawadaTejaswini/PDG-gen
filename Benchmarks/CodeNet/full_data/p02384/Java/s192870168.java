import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
	public static void main(String[] args){

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int num;
		String str;
		String[] dice, com;
		int[] command=new int[2];
		int[] int_dice=new int[6];

		try{

			str=reader.readLine();
			dice=str.split(" ");//{1,2,3,4,5,6}={dice[0], dice[1], ... ,dice[5]}={???, S, E, W, N, ???}
			for(int i=0;i<6;i++){
				int_dice[i]=Integer.parseInt(dice[i]);
			}

			num=Integer.parseInt(reader.readLine());

			for(int i=0;i<num;i++){
			str=reader.readLine();
			com=str.split(" ");
			command[0]=Integer.parseInt(com[0]);
			command[1]=Integer.parseInt(com[1]);

			if(int_dice[0]!=command[0]){
				for(int j=0;j<3;j++){
				 roll('S', int_dice);
				 if(int_dice[0]==command[0])break;
				}
				if(int_dice[0]!=command[0]){
					for(int j=0;j<3;j++){
						roll('E', int_dice);
						if(int_dice[0]==command[0])break;
					}
				}
			}//?????¢????????????????????????


			if(int_dice[1]!=command[1]){

				for(int k=0;k<3;k++){
					rotate(int_dice);
					if(int_dice[1]==command[1])break;
				}
			}//?????¢????????????????????????


			System.out.println(int_dice[2]);



			}//??¨??????num????????????




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